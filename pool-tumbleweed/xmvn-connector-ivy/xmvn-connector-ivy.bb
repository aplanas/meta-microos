SUMMARY = "XMvn Connector for Apache Ivy"
DESCRIPTION = "This package provides XMvn MOJO, which is a Maven plugin that consists \
of several MOJOs.  Some goals of these MOJOs are intended to be \
attached to default Maven lifecycle when building packages, others can \
be called directly from Maven command line."
LICENSE = "Apache-2.0"

PV = "4.0.0~20220623.8da91ea"

RPM_NAME = "xmvn-connector-ivy-4.0.0~20220623.8da91ea-1.2.noarch.rpm"
RPM_HASH = "3d530f0564d45c22676191df77467f7b89c6de25a209e567ac667e1a748529e800316dbc962577a6cf9f9eb13448517d90fb6fb0d4a9ee323e8a6b7f5df8c037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-connector-ivy \
mvn-org.fedoraproject.xmvn-xmvn-connector-ivy-pom- \
xmvn-connector-ivy"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.slf4j-slf4j-api"

inherit rpm
