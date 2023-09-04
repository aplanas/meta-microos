SUMMARY = "Jackson datatypes: collections"
DESCRIPTION = "This is a multi-module umbrella project for various Jackson \
Data-type modules to support 3rd party Collection libraries. \
 \
Currently included are: \
* Guava data-type \
* HPPC data-type \
* PCollections data-type"
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-datatypes-collections-2.15.2-1.1.noarch.rpm"
RPM_HASH = "2ef973ca93ca3e43cb0a15f7cf651f153590233985dc6c4c50dd032d64f5acdff747fdfeb6df9f85039fa46af0cc31ae8dd3e02666f1990c766d093b923d4fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections \
mvn-com.fasterxml.jackson.datatype-jackson-datatypes-collections-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
