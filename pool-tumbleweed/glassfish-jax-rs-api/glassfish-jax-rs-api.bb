SUMMARY = "JAX-RS API Specification (JSR 339)"
DESCRIPTION = "JAX-RS Java API for RESTful Web Services (JSR 339)."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.6"

RPM_NAME = "glassfish-jax-rs-api-2.1.6-1.4.noarch.rpm"
RPM_HASH = "26ac651af4e74f36148d24039c9679c8c144be96f001e37e4e92d8d045bf215f87e0d8c18f3e2b297d18aab297b52a0b9883722dff0e26d4f6f8042d8f61cebf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jax-rs-api \
mvn-jakarta.ws.rs-jakarta.ws.rs-api \
mvn-jakarta.ws.rs-jakarta.ws.rs-api-pom- \
mvn-javax.ws.rs-javax.ws.rs-api \
mvn-javax.ws.rs-javax.ws.rs-api-pom- \
osgi-jakarta.ws.rs-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
