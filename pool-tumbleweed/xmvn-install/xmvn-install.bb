SUMMARY = "XMvn Install"
DESCRIPTION = "This package provides XMvn Install, which is a command-line interface \
to XMvn installer.  The installer reads reactor metadata and performs \
artifact installation according to specified configuration."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-install-4.2.0-3.1.noarch.rpm"
RPM_HASH = "148c9de032a584bc298e25d7bc10ec549b3a1a553aa1ee81e76ad14b6f8c766e6297d5f1130febf9fa0cc7af1764e9fdc4850462e118122ab68bd240feea2f6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-install \
mvn-org.fedoraproject.xmvn-xmvn-install-pom- \
xmvn-install"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-compress \
beust-jcommander \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn-com.beust-jcommander \
mvn-org.apache.commons-commons-compress \
mvn-org.fedoraproject.xmvn-xmvn-api \
mvn-org.fedoraproject.xmvn-xmvn-core \
mvn-org.ow2.asm-asm \
mvn-org.slf4j-slf4j-api \
mvn-org.slf4j-slf4j-simple \
objectweb-asm \
slf4j \
xmvn-api \
xmvn-core"

inherit rpm
