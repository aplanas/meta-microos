SUMMARY = "Add-on module for Jackson to support HPPC data-types"
DESCRIPTION = "Jackson data-type module to support JSON serialization and \
deserialization of High-Performance Primitive Collections \
data-types."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-datatype-hppc-2.13.3-1.7.noarch.rpm"
RPM_HASH = "e9d06f23b72fd87792917ad9bbf56793bbc2eecd955ef9a26f802d9da1dfb087bbadc874961ea8bb72229658f749d5bde08e2b1133bc567e95312c1a139dd88d"
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
