SUMMARY = "Javadoc for javacc"
DESCRIPTION = "This package contains the API documentation for javacc."
LICENSE = "BSD-3-Clause"

PV = "7.0.11"

RPM_NAME = "javacc-javadoc-7.0.11-1.6.noarch.rpm"
RPM_HASH = "ddd95d1bcee0966e244e87236845a2e229758863fbcf38b3380df625769c461244b03a4ec5c5c249a76fab36322816a17882d559a65b7dcc5df16f3168fca39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "javacc-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
