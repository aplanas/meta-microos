SUMMARY = "Javadoc for maven-checkstyle-plugin"
DESCRIPTION = "This package contains the API documentation for maven-checkstyle-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "maven-checkstyle-plugin-javadoc-3.0.0-1.20.noarch.rpm"
RPM_HASH = "bbae280b9e1a419f286094b73682d20b8031f8a0e2db65841de78b51d23b834102cf9111aea720ae588667336b327bcbb27d72eb4f8f8a46caa9abce8df946f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-checkstyle-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
