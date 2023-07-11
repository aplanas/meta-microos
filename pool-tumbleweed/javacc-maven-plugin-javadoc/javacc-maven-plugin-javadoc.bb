SUMMARY = "Javadoc for javacc-maven-plugin"
DESCRIPTION = "API documentation for javacc-maven-plugin."
LICENSE = "Apache-2.0"

PV = "2.6"

RPM_NAME = "javacc-maven-plugin-javadoc-2.6-2.11.noarch.rpm"
RPM_HASH = "9574d810f41d25bf97f84e68e6700337243f6e433b26965032e68eac654bacce8039af87ee28787609d02172cab6a919cfdc171d322d4a2a7bb1aacea5cd736a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
