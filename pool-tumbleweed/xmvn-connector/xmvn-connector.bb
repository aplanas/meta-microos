SUMMARY = "XMvn Connector for Maven Resolver"
DESCRIPTION = "This package provides XMvn Connector for Maven Resolver, which \
provides integration of Maven Resolver with XMvn.  It provides an \
adapter which allows XMvn resolver to be used as Maven workspace \
reader."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-connector-4.2.0-3.1.noarch.rpm"
RPM_HASH = "e9044e9f3624fe5a126a0583a51545c7e1b2a5e1c0e4ffaa50346a3103286a6a15e5de24fcba76eba57837874bc3fcd77231bb916f9b98f48c75ea7cf03fbeae"
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
