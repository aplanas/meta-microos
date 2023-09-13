SUMMARY = "Javadocs for jnr-constants"
DESCRIPTION = "This package contains the API documentation for jnr-constants."
LICENSE = "Apache-2.0"

PV = "0.10.4"

RPM_NAME = "jnr-constants-javadoc-0.10.4-2.1.noarch.rpm"
RPM_HASH = "f7bc417847e5c5cd4af6b76739043c48cf270516827d9c7991008738d84025cba8aadbfd06618c386a31786ee1e3dc25693195feef9a79c0fcca1adf15221f97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jnr-constants-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
