SUMMARY = "API documentation for xmvn-connector"
DESCRIPTION = "This package provides API documentation for xmvn-connector."
LICENSE = "Apache-2.0"

PV = "4.2.0"

RPM_NAME = "xmvn-connector-javadoc-4.2.0-2.2.noarch.rpm"
RPM_HASH = "37a62e1aa1751b1566b38513de6503395b9d4b06354a157717baaf61d65ab47fc53665c8a5721aa15b5f3016d2b071f09a31a38eeb354c053465d26366101fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmvn-connector-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
