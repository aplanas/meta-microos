SUMMARY = "Javadoc for maven-antrun-plugin"
DESCRIPTION = "This package contains the API documentation for maven-antrun-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-antrun-plugin-javadoc-3.0.0-1.11.noarch.rpm"
RPM_HASH = "318431ef4dfb1727fb1aeb0c75a78e7a58cfdea256550c687b3bda3ed787f30e84fe81efe4d8c2d596c7067f593a178b09c82e1eb495b5b914965a427086b57e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-antrun-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
