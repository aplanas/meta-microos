SUMMARY = "Documentation for texlive-easybook"
DESCRIPTION = "This package includes the documentation for texlive-easybook"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.71dsvn64976"

RPM_NAME = "texlive-easybook-doc-2023.201.1.71dsvn64976-53.2.noarch.rpm"
RPM_HASH = "705b5921384f336ec5bb08c80515422541d64fa8f8ade5ccb57b43d40dd1ea08051ac3e343d938d802b32bca13f7a1e90860a7f942c5af5b99ca1cdfbc4e3237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-easybook-doc-zh \
texlive-easybook-doc"

RDEPENDS:${PN} += ""

inherit rpm
