SUMMARY = "XMvn Subst"
DESCRIPTION = "This package provides XMvn Subst, which is a tool that can substitute \
Maven artifact files with symbolic links to corresponding files in \
artifact repository."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-subst-4.2.0-2.1.noarch.rpm"
RPM_HASH = "f240756299f06d95b72832a4c57221477ca6cdb2cc100bb0f4e8fa741150fe1625c859ac24774ee1857f961d02aa0ba7e113f068d535bc94b302112d5214ac36"
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
