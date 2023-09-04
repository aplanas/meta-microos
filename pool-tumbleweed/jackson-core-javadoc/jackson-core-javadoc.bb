SUMMARY = "Javadoc for jackson-core"
DESCRIPTION = "This package contains API documentation for jackson-core."
LICENSE = "Apache-2.0"

PV = "2.15.2"

RPM_NAME = "jackson-core-javadoc-2.15.2-1.1.noarch.rpm"
RPM_HASH = "10b8492d56e9c27a7f469d8c06438e34ec8fa7ceaddf16f96505f3552c92c89a0f5d4c7993f2989644c849e71b893acd15063cb17a8c65c64e30ae0c68477052"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-core-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
