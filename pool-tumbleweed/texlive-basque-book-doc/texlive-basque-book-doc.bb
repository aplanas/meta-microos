SUMMARY = "Documentation for texlive-basque-book"
DESCRIPTION = "This package includes the documentation for texlive-basque-book"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.20svn32924"

RPM_NAME = "texlive-basque-book-doc-2023.209.1.20svn32924-54.1.noarch.rpm"
RPM_HASH = "38c6f847cd61ac6e7b4dd1c2da3a8aa5b2adcbf3fcc0f323744843948f5cffddd53e5ba725491dfbd3d3fc39a54a70e4b878bf86cc996e960d5352bf8532e1cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-basque-book-doc-en;eu \
texlive-basque-book-doc"

RDEPENDS:${PN} += ""

inherit rpm
