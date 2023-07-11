SUMMARY = "Jackson-JAXRS-JSON"
DESCRIPTION = "Functionality to handle JSON input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-json-provider-2.13.3-1.8.noarch.rpm"
RPM_HASH = "1e093fc5a87910e968f4fc6d18c2e6008654e7778bbfc86e6e31e7a4038c143b35ef74a5f13b39f87ed938dd12568c2a809d3ad6e3c0b2c0351053ae88532893"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-json-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-json-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.module-jackson-module-jaxb-annotations"

inherit rpm
