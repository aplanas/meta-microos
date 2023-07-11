SUMMARY = "Javadoc for bnd-maven-plugin"
DESCRIPTION = "API documentation for bnd-maven-plugin."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "bnd-maven-plugin-javadoc-5.2.0-3.2.noarch.rpm"
RPM_HASH = "13e90f9031bec1e7b532078c26a88daacc70f3aea12502f5a3240edd8456096711ad0cd07c937ba2b6b6650f2cd909a3438d5262c0cd2c6ff8020aea40c8e428"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bnd-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
