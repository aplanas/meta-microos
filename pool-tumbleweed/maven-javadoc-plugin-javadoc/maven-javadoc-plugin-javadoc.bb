SUMMARY = "Javadoc for maven-javadoc-plugin"
DESCRIPTION = "API documentation for maven-javadoc-plugin."
LICENSE = "Apache-2.0"

PV = "3.3.2"

RPM_NAME = "maven-javadoc-plugin-javadoc-3.3.2-4.3.noarch.rpm"
RPM_HASH = "124b51e36bd1cb4205f0aadd1914a4233eb69638ea7b87bd30b76508a3a168687a75fb5d3daa0ef655d1f9c3b7c2d7185d94cfac340762ff8c8a38be3f675bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
