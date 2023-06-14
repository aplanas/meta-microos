SUMMARY = "Parent for Jackson JAX-RS providers"
DESCRIPTION = "Parent POM for Jackson JAX-RS providers."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-providers-parent-2.13.3-1.7.noarch.rpm"
RPM_HASH = "8c158690aec581afc01ca23d2983499018acd6199ac325b79c5451333ec7d4991404ac4d52efe91576221c83258146fb4a4e2f790ad66fa163329f2ca7545f0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-parent \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-providers-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom-"

inherit rpm
