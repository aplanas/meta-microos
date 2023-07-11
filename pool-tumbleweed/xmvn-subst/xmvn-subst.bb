SUMMARY = "XMvn Subst"
DESCRIPTION = "This package provides XMvn Subst, which is a tool that can substitute \
Maven artifact files with symbolic links to corresponding files in \
artifact repository."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-subst-4.2.0-2.2.noarch.rpm"
RPM_HASH = "ff8e57eed90121bc0b117c2c99f9083e6d20681835ab179d9d30c2e3032f2a148534e6e4e4978dd1a4a030e1466249181b77f4fd684c5eff95cd4adcec151edc"
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
