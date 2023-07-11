SUMMARY = "API documentation for sqlite-jdbc"
DESCRIPTION = "API documentation for sqlite-jdbc."
LICENSE = "Apache-2.0"

PV = "3.42.0.0"

RPM_NAME = "sqlite-jdbc-javadoc-3.42.0.0-1.2.noarch.rpm"
RPM_HASH = "4bc8ec3fa757c6ffad4f56b9480e35d86f6d99d5f036c50affb92e7c3c433b66394cd6e9488a5c41a50b989a85bc8289df65036f69fb564c1d18cac574a38f91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sqlite-jdbc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
