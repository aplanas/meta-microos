SUMMARY = "Add-on module for Jackson to support HPPC data-types"
DESCRIPTION = "Jackson data-type module to support JSON serialization and \
deserialization of High-Performance Primitive Collections \
data-types."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-datatype-hppc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "b9a87921f4ab8a859118547828ba57260f82804c7bf9e3037c4244767fb4f61c85229214c1f8f3548a9dfb01c5abf17769760f41a0618b53107f9d6a288054ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatype-hppc \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-hppc \
mvn-com.fasterxml.jackson.datatype-jackson-datatype-hppc-pom- \
osgi-com.fasterxml.jackson.datatype.jackson-datatype-hppc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.carrotsearch-hppc \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
