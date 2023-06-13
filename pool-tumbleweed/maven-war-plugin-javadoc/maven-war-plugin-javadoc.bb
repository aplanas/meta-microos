SUMMARY = "Javadoc for maven-war-plugin"
DESCRIPTION = "API documentation for maven-war-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "maven-war-plugin-javadoc-3.2.2-3.10.noarch.rpm"
RPM_HASH = "c30382d13acd997c10549bbdb2d071f42c29afb6a280a133c62c9e8a344a728b7939ee1290baa31b365b215b29abda5a9b20db12ec8ef9f923f18282f7a793a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-war-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
