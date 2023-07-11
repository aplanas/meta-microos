SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: javax.xml.namespace.QName API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-qname-1_1-api-1.2-36.12.noarch.rpm"
RPM_HASH = "574b84a79f1ebe2b0cb16eee718a9e01d1e1ca52f19a5d3e2b5d63b2a8d93ca2552d2ebe5c0ae17888301f06e6fd86dc8b25dc83aaa9573bfbdb31cbf5f6a2d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-qname-1-1-api \
mvn-org.apache.geronimo.specs-geronimo-qname-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-qname-1.1-spec-pom- \
qname-1-1-api \
qname-api"

RDEPENDS:${PN} += "/usr/bin/sh \
java-headless \
javapackages-filesystem \
update-alternatives"

inherit rpm
