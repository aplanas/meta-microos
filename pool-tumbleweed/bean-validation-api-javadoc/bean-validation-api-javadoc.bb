SUMMARY = "Javadoc for bean-validation-api"
DESCRIPTION = "This package contains the API documentation for bean-validation-api."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "bean-validation-api-javadoc-2.0.1-1.17.noarch.rpm"
RPM_HASH = "69f276a49eca81fdbabe414df3a3c663a52399408e30eb470769562e362a3d39a78213000981d283e74137980172b86b1834dea329ef0d8324ccb376d710b91e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bean-validation-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
