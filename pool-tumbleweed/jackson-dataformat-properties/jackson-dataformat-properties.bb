SUMMARY = "Support for reading and writing content of 'Java Properties' files"
DESCRIPTION = "Jackson data format module that supports reading and writing Java Properties \
files, using naming convention to determine implied structure (by default \
assuming dotted notation, but configurable from non-nested to other \
separators)."
LICENSE = "Apache-2.0"

PV = "2.13.3"

RPM_NAME = "jackson-dataformat-properties-2.13.3-1.7.noarch.rpm"
RPM_HASH = "00cbeb976e45bae60e4ca85ffffa20a1e796f8118ec5a824e88284717262cfd091b3bd1d5feac4ab712758f62688ef14235286b8858e36120bb228e657c65e8b"
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
