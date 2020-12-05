package ru.yababay.spring.simple_beans;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.yababay.spring.simple_beans.models.Rocket;

@SpringBootApplication
public class SimpleBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleBeansApplication.class, args);
	}

	@Bean
	public Rocket prepareRocket() {
		return new Rocket();
	}
}
