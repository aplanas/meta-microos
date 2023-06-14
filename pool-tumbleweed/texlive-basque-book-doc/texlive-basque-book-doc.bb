SUMMARY = "Documentation for texlive-basque-book"
DESCRIPTION = "This package includes the documentation for texlive-basque-book"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn32924"

RPM_NAME = "texlive-basque-book-doc-2023.201.1.20svn32924-53.1.noarch.rpm"
RPM_HASH = "0785e700dc7a2657465a6ffe967b07c0ab2f574feedc250b7518e80294e891ec629f4182c3f725056c84cd2ee201b4b2f7e9ad3169c09f82fc71f1468e6836f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-basque-book-doc-en;eu \
texlive-basque-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
