SUMMARY = "JAX-RS 2.0: The Java API for RESTful Web Services"
DESCRIPTION = "JSR 339: JAX-RS 2.0: The Java API for RESTful Web Services."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only)"

PV = "1.0.1"

RPM_NAME = "jboss-jaxrs-2.0-api-1.0.1-3.9.noarch.rpm"
RPM_HASH = "467e7c1889abf21b25c5e3332eaf0781d8f486a8b833b3af19e0c7918ed4b1637b1b631476d30d762d95f8b7fb6fd6881f418558d3e5cf30059152ff18518308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-jaxrs-2.0-api \
mvn-org.jboss.resteasy-jaxrs-api \
mvn-org.jboss.resteasy-jaxrs-api-pom- \
mvn-org.jboss.spec.javax.ws.rs-jboss-jaxrs-api-2.0-spec \
mvn-org.jboss.spec.javax.ws.rs-jboss-jaxrs-api-2.0-spec-pom- \
osgi-org.jboss.spec.javax.ws.rs.jboss-jaxrs-api-2.0-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
