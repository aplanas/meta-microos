SUMMARY = "XMvn Core"
DESCRIPTION = "This package provides XMvn Core module, which implements the essential \
functionality of XMvn such as resolution of artifacts from system \
repository."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-core-4.2.0-2.1.noarch.rpm"
RPM_HASH = "38438a81f1f7fed5e6820289b0ba19313e60e75b2350a71b02fffab184b733870968cefc7ea22482b6a47c7f044a801beebf888c19615560f9f94e427280772d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.fedoraproject.xmvn:xmvn-core) \
mvn(org.fedoraproject.xmvn:xmvn-core:pom:) \
xmvn-core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
