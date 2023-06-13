SUMMARY = "Javadoc for maven-antrun-plugin"
DESCRIPTION = "This package contains the API documentation for maven-antrun-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-antrun-plugin-javadoc-3.0.0-1.10.noarch.rpm"
RPM_HASH = "24420d708f9ec7619a9eddcb2d980f93fdaeb1b0594047db558f835ea5bdd8948a5bbe3fac28045f55c548903a087045fea3218367486494f8cdee1a88c34f0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-antrun-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
