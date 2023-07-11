SUMMARY = "The StAX API"
DESCRIPTION = "Streaming API for XML \
 \
The StAX API"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "bea-stax-api-1.2.0-37.17.noarch.rpm"
RPM_HASH = "4cf0bb9d87b6d4a2b3542025f690f3784966d750d2d1d0eb1763b1f3b51cc83a75ca355bad16fceade8930e2b40e6fd716e3135f68e9971b89b3f09afa5f6916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bea-stax-api \
mvn-javax.xml.stream-stax-api \
mvn-javax.xml.stream-stax-api-pom- \
mvn-stax-stax-api \
mvn-stax-stax-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
