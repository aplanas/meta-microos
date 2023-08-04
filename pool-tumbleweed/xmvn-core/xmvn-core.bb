SUMMARY = "XMvn Core"
DESCRIPTION = "This package provides XMvn Core module, which implements the essential \
functionality of XMvn such as resolution of artifacts from system \
repository."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-core-4.2.0-4.1.noarch.rpm"
RPM_HASH = "1f647cf66737852b96f69a60264f77b28f316288dcbaaad8d60bff39aeb0bca3a46914ff51110e854600797ebcf137a1fb7cd9b36967b409b51c6c618800a285"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.fedoraproject.xmvn-xmvn-core-pom- \
xmvn-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
