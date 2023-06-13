SUMMARY = "Documentation for texlive-na-position"
DESCRIPTION = "This package includes the documentation for texlive-na-position"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn55559"

RPM_NAME = "texlive-na-position-doc-2023.201.1.2svn55559-54.1.noarch.rpm"
RPM_HASH = "631835b5018e14d4f14c65c056d0565e9b7268fec82c7856ade6d9d9258d87716872bcf93b321cae6a7387657a5feadfa59acb67fe9612ac9c005d1da8c17dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-na-position-doc:ar) \
texlive-na-position-doc"

RDEPENDS:${PN} += ""

inherit rpm
