SUMMARY = "JAX-RS: Java API for RESTful Web Services"
DESCRIPTION = "JAX-RS: Java API for RESTful Web Services"
LICENSE = "CDDL-1.0"

PV = "1.1.1"

RPM_NAME = "jsr-311-1.1.1-3.11.noarch.rpm"
RPM_HASH = "26422d301b9a2af8fbc4f7e5af912351dd93d6b8d45537407df41bfc1f492d2580a644f8b869fc14b2ed5e082d77138e8a745bfe7b05bf4d326a32415a08dd7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-311 \
mvn-javax.ws.rs-jsr311-api \
mvn-javax.ws.rs-jsr311-api-pom- \
osgi-javax.ws.rs.jsr311-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
