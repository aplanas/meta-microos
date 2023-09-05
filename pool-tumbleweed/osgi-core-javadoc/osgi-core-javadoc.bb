SUMMARY = "API documentation for osgi-core"
DESCRIPTION = "This package provides API documentation for osgi-core."
LICENSE = "Apache-2.0"

PV = "8.0.0"

RPM_NAME = "osgi-core-javadoc-8.0.0-1.1.noarch.rpm"
RPM_HASH = "9fb87349728353f228b1010086ef39908e29f06b15526331ada0c3379fd4a07d63979e46ecb8af7013803c36859eefdbf5ada986b0061dc94e6ffc7b5a272946"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "osgi-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
