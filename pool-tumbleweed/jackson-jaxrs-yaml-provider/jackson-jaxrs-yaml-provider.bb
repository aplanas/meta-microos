SUMMARY = "Jackson-JAXRS-YAML"
DESCRIPTION = "Functionality to handle YAML input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-yaml-provider-2.15.2-2.1.noarch.rpm"
RPM_HASH = "62d6f515c9389e99f2461bead0d0b4f9bd42d31f366b3dfef087bc7f22763a47a87c70d6984a3b6083c79d099d17e096640c50651ee3807dfa090e0c57975771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-yaml-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-yaml-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-yaml-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-yaml-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-yaml \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
