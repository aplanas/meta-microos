SUMMARY = "Utilities to assist with developing IO functionality"
DESCRIPTION = "Commons-IO contains utility classes, stream implementations, \
file filters, and endian classes. It is a library of utilities \
to assist with developing IO functionality."
LICENSE = "Apache-2.0"

PV = "2.11.0"

RPM_NAME = "apache-commons-io-2.11.0-2.5.noarch.rpm"
RPM_HASH = "d443de984ba92975330766b46a4bfc25214f35ff42a4239708bfe0e3030393c1856f91fd4ffce833bf70fa5b9a05be4ebddbe86532e60b826a128c014deed7f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-io \
commons-io \
jakarta-commons-io \
mvn-commons-io-commons-io \
mvn-commons-io-commons-io-pom- \
mvn-org.apache.commons-commons-io \
mvn-org.apache.commons-commons-io-pom- \
osgi-org.apache.commons.io"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
