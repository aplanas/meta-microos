SUMMARY = "Parent for Jackson JAX-RS providers"
DESCRIPTION = "Parent POM for Jackson JAX-RS providers."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-providers-parent-2.15.2-2.1.noarch.rpm"
RPM_HASH = "cc4178ad3ce630e34e07d4dc66dc6dad689a6e4447ebcdde830dbbdb216682f998d715600df8e790e70134681c2f5c905409e63a7bc7d82dd359936e9b300698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-parent \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-providers-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
