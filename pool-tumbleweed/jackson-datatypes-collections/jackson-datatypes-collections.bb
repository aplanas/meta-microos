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

RPM_NAME = "jackson-datatypes-collections-2.15.2-2.1.noarch.rpm"
RPM_HASH = "abe468c87ce31d9423e03617c07f19043c68a1d66ae269e2e533d54ea10c59388ac44f4aff71c89a575a380fb43a86e490f265539968c3f66a4d2fecae2c000a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections \
mvn-com.fasterxml.jackson.datatype-jackson-datatypes-collections-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
