SUMMARY = "Documentation for texlive-gmdoc-enhance"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc-enhance"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-doc-2023.209.0.0.2svn15878-54.2.noarch.rpm"
RPM_HASH = "2285196de90e463383ae5740474e446d8432d8aa187b6bf1a0ef15535d14f6de9d0da80682bc526134fe9bb7e909655aa3eebdb37332589e1a202fe1345db8b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-enhance-doc"

RDEPENDS:${PN} += ""

inherit rpm
