SUMMARY = "XMvn Core"
DESCRIPTION = "This package provides XMvn Core module, which implements the essential \
functionality of XMvn such as resolution of artifacts from system \
repository."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-core-4.2.0-3.1.noarch.rpm"
RPM_HASH = "c4c25c3391b0e0c6fe2980be32aca2c40bd2d34caef7dcb70d15287249d4ca2164a03b0a01d5dea1e5efd81dd1ed30176f8c6fdd58d10fdc2b9edea2e4f30d63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.fedoraproject.xmvn-xmvn-core-pom- \
xmvn-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
