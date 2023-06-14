SUMMARY = "The StAX API"
DESCRIPTION = "Streaming API for XML \
 \
The StAX API"
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "bea-stax-api-1.2.0-37.16.noarch.rpm"
RPM_HASH = "3b939aac81e7cb4c667052d048d255809352a009a9b428cbd9c32e8ee9d19d4cb2daad8fe79f5280132b88f9c404d1e25fdec8815ca862b81bf99517993b0184"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bea-stax-api \
mvn-javax.xml.stream-stax-api \
mvn-javax.xml.stream-stax-api-pom- \
mvn-stax-stax-api \
mvn-stax-stax-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
