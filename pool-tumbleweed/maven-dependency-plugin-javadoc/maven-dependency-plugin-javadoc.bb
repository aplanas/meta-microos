SUMMARY = "API documentation for maven-dependency-plugin"
DESCRIPTION = "API documentation for maven-dependency-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.2"

RPM_NAME = "maven-dependency-plugin-javadoc-3.1.2-1.18.noarch.rpm"
RPM_HASH = "acf06efeef3676b7b71912bd05af5dd997e351b70b44e911aa720073b9f98a9e593bc9d593fcc958bb1c241aa1fa3bb5cd2eee47f925b2292214b79fd616bc78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-dependency-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
