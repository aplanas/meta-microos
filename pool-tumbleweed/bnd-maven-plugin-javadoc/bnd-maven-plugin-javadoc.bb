SUMMARY = "Javadoc for bnd-maven-plugin"
DESCRIPTION = "API documentation for bnd-maven-plugin."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "bnd-maven-plugin-javadoc-5.2.0-3.1.noarch.rpm"
RPM_HASH = "042fa1706a037ec666722f678e2a7c34a2d8ad2a81e334577484be0f208141a237fa29c031291c7f7f2767171d21a8a102466a08299b58a80a53691dce1572f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bnd-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
