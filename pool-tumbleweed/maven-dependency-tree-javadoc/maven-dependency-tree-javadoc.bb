SUMMARY = "Javadoc for maven-dependency-tree"
DESCRIPTION = "This package contains javadoc for maven-dependency-tree."
LICENSE = "Apache-2.0"

PV = "3.0.1"

RPM_NAME = "maven-dependency-tree-javadoc-3.0.1-3.13.noarch.rpm"
RPM_HASH = "da4bf4b5a996cd798aad5975f30a547bc943730e2bf438ea0329d53e66eb4e38ced4e59f6cc9709432fd75c8ea19ebdc7721d387029bfe4683844713c140f7ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-tree-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
