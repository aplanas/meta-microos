SUMMARY = "Support for reading and writing content of 'Java Properties' files"
DESCRIPTION = "Jackson data format module that supports reading and writing Java Properties \
files, using naming convention to determine implied structure (by default \
assuming dotted notation, but configurable from non-nested to other \
separators)."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-dataformat-properties-2.15.2-1.1.noarch.rpm"
RPM_HASH = "33040cd0e3465dbbfe5e4061741e7d5fbcaf56fee72d7de0ea32eb5b887d16d92983976c5c014053d1b5093c575b429fba666441eab0d6f34185aaff458d1008"
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
