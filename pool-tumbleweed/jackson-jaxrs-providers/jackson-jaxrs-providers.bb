SUMMARY = "Jackson JAX-RS providers"
DESCRIPTION = "This is a multi-module project that contains Jackson-based JAX-RS providers for \
following data formats: JSON, Smile (binary JSON), XML, CBOR (another kind of \
binary JSON), YAML."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-providers-2.15.2-1.1.noarch.rpm"
RPM_HASH = "429c48d1ef5bb23cb2f6dffcd1fbbf64c839de6847a3c34fcc0bc370740cc00a9ea966c64e880d37c10768e31fe154bcdc04dec65f9c166caa73b1077483ce23"
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
