SUMMARY = "Javadoc for maven-surefire-plugins"
DESCRIPTION = "Javadoc for maven-surefire-plugins."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "2.22.0"

RPM_NAME = "maven-surefire-plugins-javadoc-2.22.0-8.1.noarch.rpm"
RPM_HASH = "94683e11fdec42fcad673c87a712c756adbcc82edfd0db278105e55c408eecc89263f073fde6315dd76d5d9e8047a80766a1f68489007c68ffd58c1f347c1a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-plugins-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
