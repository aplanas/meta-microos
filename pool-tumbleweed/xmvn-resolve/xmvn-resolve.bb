SUMMARY = "XMvn Resolver"
DESCRIPTION = "This package provides XMvn Resolver, which is a very simple \
command-line tool to resolve Maven artifacts from system repositories. \
Basically it's just an interface to artifact resolution mechanism \
implemented by XMvn Core.  The primary intended use case of XMvn \
Resolver is debugging local artifact repositories."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-resolve-4.2.0-2.1.noarch.rpm"
RPM_HASH = "2af6d4321aff3f9862459eb897c220cae57208e2584509580dc877e408fb0dd50d232d793f5583ed492bd45c3e0a640c97d9c3dbad0f22711cbf78a551ec38a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(org.fedoraproject.xmvn:xmvn-resolve) \
mvn(org.fedoraproject.xmvn:xmvn-resolve:pom:) \
xmvn-resolve"
RDEPENDS:${PN} += "/bin/bash \
beust-jcommander \
java-headless \
javapackages-filesystem \
javapackages-tools \
mvn(com.beust:jcommander) \
mvn(org.fedoraproject.xmvn:xmvn-api) \
mvn(org.fedoraproject.xmvn:xmvn-core) \
xmvn-api \
xmvn-core"

inherit rpm
