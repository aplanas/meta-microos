SUMMARY = "Javadoc for maven-doxia"
DESCRIPTION = "API documentation for maven-doxia."
LICENSE = "Apache-2.0"

PV = "1.9.1"

RPM_NAME = "maven-doxia-javadoc-1.9.1-6.7.noarch.rpm"
RPM_HASH = "95a1de0b4755c5f9752732b974793ad80b8666e890df2691a757e0df7076327be5e7021646dc18e50b8d72d0c21b881f3a3cf7232c569aebb6f70f411cbd63c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-doxia-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
