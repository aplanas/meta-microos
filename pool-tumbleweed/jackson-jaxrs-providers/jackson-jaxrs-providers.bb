SUMMARY = "Jackson JAX-RS providers"
DESCRIPTION = "This is a multi-module project that contains Jackson-based JAX-RS providers for \
following data formats: JSON, Smile (binary JSON), XML, CBOR (another kind of \
binary JSON), YAML."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-providers-2.15.2-2.1.noarch.rpm"
RPM_HASH = "f77b77d8b0f58631dee747cbb2a5f96725907adea848b13232061a099b2d1776266080e4f4b7680277f1460c10a6eb4392e213ad9e68af10e6577e2cbcf4b3d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-base-pom- \
osgi-com.fasterxml.jackson.jaxrs.jackson-jaxrs-base"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
