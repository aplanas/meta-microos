SUMMARY = "Code Generation Library"
DESCRIPTION = "cglib is a powerful, high performance and quality Code Generation \
Library, It is used to extend JAVA classes and implements interfaces at \
runtime."
LICENSE = "Apache-2.0"

PV = "3.3.0"

RPM_NAME = "cglib-javadoc-3.3.0-4.5.noarch.rpm"
RPM_HASH = "9b9fd019d29e82f2d65b528c78f0701e729310098dd50289cae3bd22a2ff860ab82fc52434a1c68c0c2a8909813590bfdecf59b456c392280079c28fc0a32f21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cglib-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
