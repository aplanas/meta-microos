SUMMARY = "Javadoc for maven-wagon"
DESCRIPTION = "Javadoc for maven-wagon."
LICENSE = "Apache-2.0"

PV = "3.5.3"

RPM_NAME = "maven-wagon-javadoc-3.5.3-1.1.noarch.rpm"
RPM_HASH = "9350edc0402b66b661afc3e3d3891fe5c1c0fd18dcd81e11b8114b6fe2b6a3a2880849067bf582be87a77f93661d9de400ad14913b2159511727e1877991c846"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-wagon-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
