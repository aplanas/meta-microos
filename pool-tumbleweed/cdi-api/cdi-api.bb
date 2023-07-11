SUMMARY = "Contexts and Dependency Injection for Java EE"
DESCRIPTION = "APIs for JSR-299: Contexts and Dependency Injection for Java EE"
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "cdi-api-2.0.2-2.4.noarch.rpm"
RPM_HASH = "76b84354baa636acf9b106ea5f2c96e6e90dc00bb2c9a8b8be85a8616f62d98b6ae3593f1da84b93918a7e8744b4a410dca9e370180a9249751fb9cea5a35ab5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdi-api \
mvn-jakarta.enterprise-jakarta.enterprise.cdi-api \
mvn-jakarta.enterprise-jakarta.enterprise.cdi-api-pom- \
mvn-javax.enterprise-cdi-api \
mvn-javax.enterprise-cdi-api-pom- \
osgi-jakarta.enterprise.cdi-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-jakarta.inject-jakarta.inject-api \
mvn-javax.inject-javax.inject \
mvn-org.jboss.spec.javax.interceptor-jboss-interceptors-api-1.2-spec"

inherit rpm
