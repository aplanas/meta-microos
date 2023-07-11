SUMMARY = "API documentation for maven"
DESCRIPTION = "API documentation for maven."
LICENSE = "Apache-2.0 & MIT"

PV = "3.9.2"

RPM_NAME = "maven-javadoc-3.9.2-1.1.noarch.rpm"
RPM_HASH = "6b176eef360e8c42a4c54bfa5923fb94f7ad2d5e9af3c29d75275b87b536b76d5a93d89f28904646897ef3d2c2e755e4e6e2d5e4c5fe38ce0065cd3cedc07936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
