SUMMARY = "Support for reading and writing content of 'Java Properties' files"
DESCRIPTION = "Jackson data format module that supports reading and writing Java Properties \
files, using naming convention to determine implied structure (by default \
assuming dotted notation, but configurable from non-nested to other \
separators)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-properties-2.13.3-1.8.noarch.rpm"
RPM_HASH = "0952986737668f697b05ca2cf547621bb038dde926bdc5546ad42017b4134722b1e689ef9846d57c780aabfe06a8c90f7c23305b68fabea575e3567ee581f18a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-dataformat-properties \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-properties \
mvn-com.fasterxml.jackson.dataformat-jackson-dataformat-properties-pom- \
osgi-com.fasterxml.jackson.dataformat.jackson-dataformat-properties"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm
