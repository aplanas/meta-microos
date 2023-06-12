SUMMARY = "Javadoc for maven-dependency-tree"
DESCRIPTION = "This package contains javadoc for maven-dependency-tree."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-dependency-tree-javadoc-3.0.1-3.12.noarch.rpm"
RPM_HASH = "a04b0abac5bc81e7cb682e0207a8b22681dd0106024b717981f7a648c40a326826c283a6fe97c6f045872788ee56903f90b32f980042409f9c495583f52b655e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-tree-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
