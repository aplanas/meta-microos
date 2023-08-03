SUMMARY = "Documentation for texlive-vpe"
DESCRIPTION = "This package includes the documentation for texlive-vpe"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn26039"

RPM_NAME = "texlive-vpe-doc-2023.209.0.0.2svn26039-54.1.noarch.rpm"
RPM_HASH = "ea96d501a10604adc273fbb78acfd9e8de2160da27ade80f4c5453b4add06b43e47dd147e49df7da3a0187b5016c3b91061bed44b4a5638b3eb3232c67963de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vpe-doc"

RDEPENDS:${PN} += ""

inherit rpm
