SUMMARY = "Jackson JAX-RS providers"
DESCRIPTION = "This is a multi-module project that contains Jackson-based JAX-RS providers for \
following data formats: JSON, Smile (binary JSON), XML, CBOR (another kind of \
binary JSON), YAML."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-jaxrs-providers-2.13.3-1.8.noarch.rpm"
RPM_HASH = "3369eb63d878919b9833fd8e006897e8211e2ed4a3172b3d7886a11e6af1f4191372c7e6d9be9f1c764a4ce4e3a32942feed95d8d85c0f6e245dfdbdf0a220fb"
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
