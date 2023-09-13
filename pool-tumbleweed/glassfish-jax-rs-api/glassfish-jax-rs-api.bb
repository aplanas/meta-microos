SUMMARY = "JAX-RS API Specification (JSR 339)"
DESCRIPTION = "JAX-RS Java API for RESTful Web Services (JSR 339)."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.6"

RPM_NAME = "glassfish-jax-rs-api-2.1.6-2.1.noarch.rpm"
RPM_HASH = "469df03bb1993fffbf067c1a7ea904dabba95fd04c405eb7509379b700bb6d888afce60e715b6dc7ee52addd7d06255d2adab2b38ced45e007246c0d05825bb4"
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
