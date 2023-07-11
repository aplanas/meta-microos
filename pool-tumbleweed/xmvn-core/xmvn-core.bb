SUMMARY = "XMvn Core"
DESCRIPTION = "This package provides XMvn Core module, which implements the essential \
functionality of XMvn such as resolution of artifacts from system \
repository."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-core-4.2.0-2.2.noarch.rpm"
RPM_HASH = "aa72083971a9404039d432f12008b2a27dbcc722815fed5c51f423d6e90261f431fbdd4b5c46a8c7d25d01545b8cbcbe1a934cb27159d0985722e95c904e5097"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.fedoraproject.xmvn-xmvn-core-pom- \
xmvn-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
