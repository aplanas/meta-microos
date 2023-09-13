SUMMARY = "Support for reading and writing content of 'Java Properties' files"
DESCRIPTION = "Jackson data format module that supports reading and writing Java Properties \
files, using naming convention to determine implied structure (by default \
assuming dotted notation, but configurable from non-nested to other \
separators)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-properties-2.15.2-2.1.noarch.rpm"
RPM_HASH = "36eb82cae53d79ab9f682391dbb4a60272054788db44488beec49c4b84dbbfee8f9bab0f4657828adc2e3d20209072707d349760943fd58c1525560071f4d4ea"
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
