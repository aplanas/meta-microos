SUMMARY = "Contexts and Dependency Injection for Java EE"
DESCRIPTION = "APIs for JSR-299: Contexts and Dependency Injection for Java EE"
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "cdi-api-2.0.2-2.3.noarch.rpm"
RPM_HASH = "bba805f9e89a265a3ae2d591a3fcfbb73334c002aa44cf2c0f5bdc8bc3d51827470f8482c16edb540605f652a80193060f5addfdf1dc867702ed4bd8e861a36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cdi-api \
mvn(jakarta.enterprise:jakarta.enterprise.cdi-api) \
mvn(jakarta.enterprise:jakarta.enterprise.cdi-api:pom:) \
mvn(javax.enterprise:cdi-api) \
mvn(javax.enterprise:cdi-api:pom:) \
osgi(jakarta.enterprise.cdi-api)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(jakarta.inject:jakarta.inject-api) \
mvn(javax.inject:javax.inject) \
mvn(org.jboss.spec.javax.interceptor:jboss-interceptors-api_1.2_spec)"

inherit rpm
