SUMMARY = "XMvn Resolver"
DESCRIPTION = "This package provides XMvn Resolver, which is a very simple \
command-line tool to resolve Maven artifacts from system repositories. \
Basically it's just an interface to artifact resolution mechanism \
implemented by XMvn Core.  The primary intended use case of XMvn \
Resolver is debugging local artifact repositories."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-resolve-4.2.0-3.1.noarch.rpm"
RPM_HASH = "921c1f9a388e82e034c0ddcdc2289a96050e5914bf20abfbb4a364e8656eda44b42081dbfd367446e1bdec25f8a547f8fbe586722273df0db3cfec03ea1f1368"
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
