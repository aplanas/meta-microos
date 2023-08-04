SUMMARY = "XMvn Connector for Maven Resolver"
DESCRIPTION = "This package provides XMvn Connector for Maven Resolver, which \
provides integration of Maven Resolver with XMvn.  It provides an \
adapter which allows XMvn resolver to be used as Maven workspace \
reader."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-connector-4.2.0-4.1.noarch.rpm"
RPM_HASH = "24c7755cf57c32b6dd595b2e6caf4721988f957d59ce01debc60b5d23de39cca0998c1ef66005bc48d51b092bc9dda685743fa6b5b832a2472204acce27b12e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-connector \
mvn-org.fedoraproject.xmvn-xmvn-connector-pom- \
xmvn-connector \
xmvn-connector-aether"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core"

inherit rpm
