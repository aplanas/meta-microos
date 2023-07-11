SUMMARY = "Streaming API for XML"
DESCRIPTION = "The Streaming API for XML (StAX) is a groundbreaking new Java API for \
parsing and writing XML easily and efficiently."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "bea-stax-1.2.0-37.17.noarch.rpm"
RPM_HASH = "e9d1632a6eb794723ee5efd8dccf2233efbd50d2dcc07c011a922aae12934b91bf4afd00e66d068aba41777386963d847e5bb161f87c5ab7ef34283151ddd08e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bea-stax \
mvn-stax-stax \
mvn-stax-stax-pom-"

RDEPENDS:${PN} += "bea-stax-api \
java-headless \
javapackages-filesystem \
mvn-junit-junit \
mvn-stax-stax-api"

inherit rpm
