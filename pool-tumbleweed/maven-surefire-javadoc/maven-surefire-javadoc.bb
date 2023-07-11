SUMMARY = "Javadoc for maven-surefire"
DESCRIPTION = "Javadoc for maven-surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-javadoc-2.22.0-8.2.noarch.rpm"
RPM_HASH = "9b4bfc635760731ed7175963df73ee2032479320ab4d40b8468e5a9b3aedf3e8f43370db3d6f096bed932f16276ac38778aaf1990691bb622e7c0a77d8c292a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
