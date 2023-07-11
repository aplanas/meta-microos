SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java API for XML-Based RPC (JAXRPC)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaxrpc-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "b6f09961137dd50422ad0bada9332b2005725f28e5a90cdf42fb9b4e5e2fdfab4e1008f165b1695b5c7cc339dcb197700ec072b3a2c57a25f3bb861fa9cc3908"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jaxrpc-1-1-api \
jaxrpc \
jaxrpc-1-1-api \
jaxrpc-api \
mvn-org.apache.geronimo.specs-geronimo-jaxrpc-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jaxrpc-1.1-spec-pom-"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
qname-1-1-api \
saaj-1-1-api \
servlet-2-4-api \
update-alternatives"

inherit rpm
