SUMMARY = "XMvn Install"
DESCRIPTION = "This package provides XMvn Install, which is a command-line interface \
to XMvn installer.  The installer reads reactor metadata and performs \
artifact installation according to specified configuration."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-install-4.2.0-2.2.noarch.rpm"
RPM_HASH = "238bc00f57ff633a9bf005a0a3cf7d078d517ff4f11117e0f883fc250e42de392f96379f3dc2f0c2938953de484e505e554ca89ad13875c2db5b3a251ea2b63c"
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
