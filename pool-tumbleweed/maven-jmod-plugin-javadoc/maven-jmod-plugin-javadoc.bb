SUMMARY = "Javadoc for maven-jmod-plugin"
DESCRIPTION = "API documentation for maven-jmod-plugin."
LICENSE = "Apache-2.0"

PV = "3.0.0~alpha1"

RPM_NAME = "maven-jmod-plugin-javadoc-3.0.0~alpha1-2.21.noarch.rpm"
RPM_HASH = "9a45c8124421cad937922464109c1ac2d3b30ce3400000a16bef45cbd5c64fe8342ee19487a3a380b188f834b75e0f14fb015ae17cdb54fdae9c197b6e2e7060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jmod-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
