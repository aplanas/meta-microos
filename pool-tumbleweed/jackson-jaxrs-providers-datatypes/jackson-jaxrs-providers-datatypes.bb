SUMMARY = "Functionality for reading/writing core JAX-RS helper types"
DESCRIPTION = "Functionality for reading/writing core JAX-RS helper types."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-jaxrs-providers-datatypes-2.15.2-1.1.noarch.rpm"
RPM_HASH = "521e06dff1e8937c0f9a2bb800ec12d119e2994a3fff13f591c9ae6afeb849c2f4227e80e430b75324f27b3162b542849e9b8ac44cfb7b4dfae7bb8ee05be578"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-jaxrs-providers-datatypes \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jaxrs \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-jaxrs-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-jaxrs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
