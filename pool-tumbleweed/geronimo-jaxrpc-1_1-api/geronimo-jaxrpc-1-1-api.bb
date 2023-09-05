SUMMARY = "Geronimo J2EE server J2EE specifications"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java API for XML-Based RPC (JAXRPC)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaxrpc-1_1-api-1.2-37.1.noarch.rpm"
RPM_HASH = "867117279512a8fce6f49a5154c86ecd8fb8f3ca466baebcc4436f54992e07b00a83885932b1c28f9dbdb77100b07cfc4a51e9b460059d665f5bf58dbf967f7d"
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
