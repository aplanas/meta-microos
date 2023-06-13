SUMMARY = "Javadoc for maven-jar-plugin"
DESCRIPTION = "API documentation for maven-jar-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-jar-plugin-javadoc-3.2.2-3.7.noarch.rpm"
RPM_HASH = "0718ef636a9fd64168cfef51a3d44a63750b729a441c5854c3b9abd67091662d3b914badae67763be7ff3075808733a5dc69157fd9147f9ed7aedf6d15debf5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jar-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
