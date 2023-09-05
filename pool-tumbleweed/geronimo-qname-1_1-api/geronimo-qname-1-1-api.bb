SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: javax.xml.namespace.QName API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-qname-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "53d438b3941e4af8b0ff509faa334194a56cd0b3bccf427257b01fb3dd9ea649813d8f723b02108dbca73a1b43867a135058821376b107d9d1fe91f0700fa4fd"
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
