SUMMARY = "Documentation for texlive-reledmac"
DESCRIPTION = "This package includes the documentation for texlive-reledmac"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.39.1svn63105"

RPM_NAME = "texlive-reledmac-doc-2023.201.2.39.1svn63105-53.2.noarch.rpm"
RPM_HASH = "18b090fa5069fa3204d424477f1573bb15893e9855dc6634628092453da4771cec06dc2e02da167b460c30949c95043348a8b394de69a7800e3200199be02c63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
