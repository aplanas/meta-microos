SUMMARY = "XMvn Subst"
DESCRIPTION = "This package provides XMvn Subst, which is a tool that can substitute \
Maven artifact files with symbolic links to corresponding files in \
artifact repository."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-subst-4.2.0-4.1.noarch.rpm"
RPM_HASH = "9180ac53c706cca355283109755e8689f122c3f36132eabbb6fe6eb1f870e7b00d026d514f62807b82712c28fa67e4afe36ed33728f46ab8340465c3fea8c32f"
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
