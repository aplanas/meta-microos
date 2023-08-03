SUMMARY = "Documentation for texlive-bxenclose"
DESCRIPTION = "This package includes the documentation for texlive-bxenclose"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn40213"

RPM_NAME = "texlive-bxenclose-doc-2023.209.0.0.2svn40213-53.1.noarch.rpm"
RPM_HASH = "e342deb4ad93328718eb20f92c8041b8a3bace7950b8461f2ed9c43c541d323868eab6d508f940cb89fd589392e0cc0756cd70ab0b4845e25518dcbcf71af4cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxenclose-doc"

RDEPENDS:${PN} += ""

inherit rpm
