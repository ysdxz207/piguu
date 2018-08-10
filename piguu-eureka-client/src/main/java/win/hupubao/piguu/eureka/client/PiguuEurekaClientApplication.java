package win.hupubao.piguu.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PiguuEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PiguuEurekaClientApplication.class, args);
    }
}
