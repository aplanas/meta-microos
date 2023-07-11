SUMMARY = "Jackson datatypes: collections"
DESCRIPTION = "This is a multi-module umbrella project for various Jackson \
Data-type modules to support 3rd party Collection libraries. \
 \
Currently included are: \
* Guava data-type \
* HPPC data-type \
* PCollections data-type"
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-datatypes-collections-2.13.3-1.8.noarch.rpm"
RPM_HASH = "d7ae12d5aded8c9eba3a859cc7bb107701e6d40bb9daddb97af0e74c51e560098c2e87571f3c3b9d3908ee6cb4c2db21d3d41ce0ddb6f478bca10e135d5bd730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections \
mvn-com.fasterxml.jackson.datatype-jackson-datatypes-collections-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
