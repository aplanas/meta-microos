SUMMARY = "XMvn Connector for Maven Resolver"
DESCRIPTION = "This package provides XMvn Connector for Maven Resolver, which \
provides integration of Maven Resolver with XMvn.  It provides an \
adapter which allows XMvn resolver to be used as Maven workspace \
reader."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-connector-4.2.0-2.1.noarch.rpm"
RPM_HASH = "22a4fd9da88ce9303922b68888b5ca04776a2633133d5f51f94c119f8f97345c0be001f95db41f894ea1e76bf6099e65cb6868627436a33ff9d82fd7d90ab72f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.fedoraproject.xmvn:xmvn-connector) \
mvn(org.fedoraproject.xmvn:xmvn-connector:pom:) \
xmvn-connector \
xmvn-connector-aether"
RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn(org.fedoraproject.xmvn:xmvn-api) \
mvn(org.fedoraproject.xmvn:xmvn-core)"

inherit rpm
