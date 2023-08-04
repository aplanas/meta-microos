SUMMARY = "XMvn Resolver"
DESCRIPTION = "This package provides XMvn Resolver, which is a very simple \
command-line tool to resolve Maven artifacts from system repositories. \
Basically it's just an interface to artifact resolution mechanism \
implemented by XMvn Core.  The primary intended use case of XMvn \
Resolver is debugging local artifact repositories."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-resolve-4.2.0-4.1.noarch.rpm"
RPM_HASH = "c1fd8d0a86a70ba17255ff74ff3161cda861069eca337b28fb6f768df7cf9cebc6886d7ebf4be2254cbbebbc46e430b39496eb47a38343218ebb2ac155daf14f"
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
