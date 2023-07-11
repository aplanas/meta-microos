SUMMARY = "XMvn Connector for Maven Resolver"
DESCRIPTION = "This package provides XMvn Connector for Maven Resolver, which \
provides integration of Maven Resolver with XMvn.  It provides an \
adapter which allows XMvn resolver to be used as Maven workspace \
reader."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-connector-4.2.0-2.2.noarch.rpm"
RPM_HASH = "4339e6ffed109b1f9326d7962989c77123ac3cca3f7273e72c12273ce6d54411ae0cf159096cefa78334e25cb5b58d8afa4f4a0af56c19ebeec0988cb2ea4fca"
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
