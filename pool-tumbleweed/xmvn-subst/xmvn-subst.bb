SUMMARY = "XMvn Subst"
DESCRIPTION = "This package provides XMvn Subst, which is a tool that can substitute \
Maven artifact files with symbolic links to corresponding files in \
artifact repository."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-subst-4.2.0-3.1.noarch.rpm"
RPM_HASH = "b94fb32868028136844510492b419b779aa9531770e974371d4144ae3d745f818b4a01c643d0c0a13e043f97e8543474b87a217c111cc09b1f4f29a17c373dd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-subst \
mvn-org.fedoraproject.xmvn-xmvn-subst-pom- \
xmvn-subst"

RDEPENDS:${PN} += "/usr/bin/bash \
beust-jcommander \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.beust-jcommander \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core \
xmvn-api \
xmvn-core"

inherit rpm
