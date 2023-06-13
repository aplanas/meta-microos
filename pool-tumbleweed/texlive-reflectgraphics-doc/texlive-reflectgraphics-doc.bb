SUMMARY = "Documentation for texlive-reflectgraphics"
DESCRIPTION = "This package includes the documentation for texlive-reflectgraphics"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2csvn40612"

RPM_NAME = "texlive-reflectgraphics-doc-2023.201.0.0.2csvn40612-53.1.noarch.rpm"
RPM_HASH = "9c009bf46e8ae1470ceda1dc0b6a0114d0abb0fa209ca76360d5dc8f4261a7e75c4c5c1b61eea2a9450167fc27927d80479bcba625e8502d1b5dc1b1343b05c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reflectgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
