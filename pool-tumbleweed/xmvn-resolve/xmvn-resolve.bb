SUMMARY = "XMvn Resolver"
DESCRIPTION = "This package provides XMvn Resolver, which is a very simple \
command-line tool to resolve Maven artifacts from system repositories. \
Basically it's just an interface to artifact resolution mechanism \
implemented by XMvn Core.  The primary intended use case of XMvn \
Resolver is debugging local artifact repositories."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-resolve-4.2.0-2.2.noarch.rpm"
RPM_HASH = "dd206a4f5bbb57837f8284301e4537361707e01fdeebe51b58c7c70ad94b62f10b363c733c30c1e620cc92d337d04ab6566c2e7f0db136944bc4d4462177bfcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.fedoraproject.xmvn-xmvn-resolve \
mvn-org.fedoraproject.xmvn-xmvn-resolve-pom- \
xmvn-resolve"

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
