SUMMARY = "API documentation for Sisu"
DESCRIPTION = "This package contains API documentation for Sisu."
LICENSE = "BSD-3-Clause & EPL-1.0"

PV = "0.3.5"

RPM_NAME = "sisu-javadoc-0.3.5-3.6.noarch.rpm"
RPM_HASH = "07381d6d7ff947dee8c78f9e26336237d01299b0b6e0dc27073d0950269e07ba638a62c7836b3fc10406b3d7c0247d24a4c2a7da1fab9addc864ca5d448645c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sisu-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
