SUMMARY = "Java implementation of multi-cast DNS"
DESCRIPTION = "JmDNS is a Java implementation of multi-cast DNS \
and can be used for service registration and discovery \
in local area networks. JmDNS is fully compatible \
with Apple's Bonjour."
LICENSE = "Apache-2.0"

PV = "3.5.7"

RPM_NAME = "jmdns-3.5.7-2.11.noarch.rpm"
RPM_HASH = "27cc05828f55cd1ebba508dcb234d802e964e4e1625f3059551d81e663dd0cd968c34d97086f099913eacd3c0012373c50aecfc9f5af21e86e855f82417c140c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jmdns \
mvn-javax.jmdns-jmdns \
mvn-javax.jmdns-jmdns-pom- \
mvn-org.jmdns-jmdns \
mvn-org.jmdns-jmdns-pom- \
osgi-javax.jmdns"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
