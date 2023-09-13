SUMMARY = "Jackson-JAXRS-JSON"
DESCRIPTION = "Functionality to handle JSON input/output for JAX-RS implementations \
(like Jersey and RESTeasy) using standard Jackson data binding."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-json-provider-2.15.2-2.1.noarch.rpm"
RPM_HASH = "be14cbbbb1a39790c3d58107459c9fe20e23a07ca307a73cba11da3c647ddfc3d5ee54bbaa807f314ffa0822305b7fdf00d447fe62088723a3dd9571db9310c0"
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
