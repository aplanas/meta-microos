SUMMARY = "Documentation for texlive-eqnalign"
DESCRIPTION = "This package includes the documentation for texlive-eqnalign"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-doc-2023.209.1.0asvn43278-54.2.noarch.rpm"
RPM_HASH = "09047da6720b134ab448671ec76e567da367c7ddfacb2ad11c72f7db5fdc1fdca12e29f2a7cc26103ae0a6dd26563d50ebe73afb3f3056a9feb2dbd6f85f01d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnalign-doc"

RDEPENDS:${PN} += ""

inherit rpm
