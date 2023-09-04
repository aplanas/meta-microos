SUMMARY = "Jackson-JAXRS-YAML"
DESCRIPTION = "Functionality to handle YAML input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-yaml-provider-2.15.2-1.1.noarch.rpm"
RPM_HASH = "f295916788c0ab2398a851d88de84a7ec33fae33ff186fe0f203a011c4ce08dc941b0ded6194d2dd82abd51a233022a0a8f5a026c3954291f4a9bbff7e59d202"
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
