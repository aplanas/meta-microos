SUMMARY = "Documentation for texlive-fnumprint"
DESCRIPTION = "This package includes the documentation for texlive-fnumprint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn29173"

RPM_NAME = "texlive-fnumprint-doc-2023.209.1.1asvn29173-53.1.noarch.rpm"
RPM_HASH = "963bdd2dafa9f60891b00f2e4492d3ca2728e7259421f6035db775600fe6cebab1f2d598035ade1f7cabf3c772629082509964a6e5abae3e68026045137398ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnumprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
