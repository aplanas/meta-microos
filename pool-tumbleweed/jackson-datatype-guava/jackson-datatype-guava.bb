SUMMARY = "Add-on module for Jackson which handles Guava data-types"
DESCRIPTION = "Add-on datatype-support module for Jackson that handles \
Guava types (currently mostly just collection ones)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-datatype-guava-2.13.3-1.7.noarch.rpm"
RPM_HASH = "26c86f4d15e858cda04baf93cbd546b944e5d843a0441a4fdee2cb3dd1c9533316016664737345762fdfdd800bfa8edf2853bc7496a0dfb3ac96615e9f70f268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatype-guava \
mvn(com.fasterxml.jackson.datatype:jackson-datatype-guava) \
mvn(com.fasterxml.jackson.datatype:jackson-datatype-guava:pom:) \
osgi(com.fasterxml.jackson.datatype.jackson-datatype-guava)"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(com.fasterxml.jackson.core:jackson-core) \
mvn(com.fasterxml.jackson.core:jackson-databind) \
mvn(com.google.guava:guava)"

inherit rpm
