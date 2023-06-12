SUMMARY = "Documentation for texlive-xcolor-solarized"
DESCRIPTION = "This package includes the documentation for texlive-xcolor-solarized"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-doc-2023.201.0.0.4svn61719-52.1.noarch.rpm"
RPM_HASH = "c2e29713e1bf2631e9f7ade8c7d240335978500d693a27844dfccc7bb0415b3428f494744fe9e527098f67cb85a0122db0617ef79f6f3d196c0a84ae97d09506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-solarized-doc"
RDEPENDS:${PN} += ""

inherit rpm
