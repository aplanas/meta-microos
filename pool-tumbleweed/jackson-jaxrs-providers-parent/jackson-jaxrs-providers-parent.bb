SUMMARY = "Parent for Jackson JAX-RS providers"
DESCRIPTION = "Parent POM for Jackson JAX-RS providers."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-providers-parent-2.13.3-1.8.noarch.rpm"
RPM_HASH = "c414f45e880bae71b82c6f5d65d53aefb1254700a7c34822c9ca88db0bacff16e7e2d79ead8c2d41168d0bbea09fba942bce011504ec1816ebbab163b22a5647"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-parent \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-providers-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
