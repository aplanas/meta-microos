SUMMARY = "JAX-RS: Java API for RESTful Web Services"
DESCRIPTION = "JAX-RS: Java API for RESTful Web Services"
LICENSE = "CDDL-1.0"

PV = "1.1.1"

RPM_NAME = "jsr-311-1.1.1-3.10.noarch.rpm"
RPM_HASH = "cf8b1887372c5d0f961124a96af316ed680a615f64a27f3050f3d78062aa9a84dfb4b8071fd3d89f1c94dd4fba4508f8fb102500e782083f382bb04f2f130531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-311 \
mvn(javax.ws.rs:jsr311-api) \
mvn(javax.ws.rs:jsr311-api:pom:) \
osgi(javax.ws.rs.jsr311-api)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
