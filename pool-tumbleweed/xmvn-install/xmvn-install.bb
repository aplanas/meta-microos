SUMMARY = "XMvn Install"
DESCRIPTION = "This package provides XMvn Install, which is a command-line interface \
to XMvn installer.  The installer reads reactor metadata and performs \
artifact installation according to specified configuration."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-install-4.2.0-4.1.noarch.rpm"
RPM_HASH = "df78ea980cddcc9ae7f6a93af95445bff05ea297500eae386bac5ea3c0dd4d27e384bae6f4cf1bd4ebe6d501fbc7e26388728db0f88b9978a72e7e70f983e651"
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
