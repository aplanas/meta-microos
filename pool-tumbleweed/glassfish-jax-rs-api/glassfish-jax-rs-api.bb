SUMMARY = "JAX-RS API Specification (JSR 339)"
DESCRIPTION = "JAX-RS Java API for RESTful Web Services (JSR 339)."
LICENSE = "EPL-2.0 | GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "2.1.6"

RPM_NAME = "glassfish-jax-rs-api-2.1.6-1.3.noarch.rpm"
RPM_HASH = "bd66f1ba625b85dbfd0c05761841deaac4ca1220af12be9974cb50027ed07f2e97ed768b87334e036efd87944d8966130f772c50ecb2da84bcc13179cec667b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jax-rs-api \
mvn(jakarta.ws.rs:jakarta.ws.rs-api) \
mvn(jakarta.ws.rs:jakarta.ws.rs-api:pom:) \
mvn(javax.ws.rs:javax.ws.rs-api) \
mvn(javax.ws.rs:javax.ws.rs-api:pom:) \
osgi(jakarta.ws.rs-api)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
