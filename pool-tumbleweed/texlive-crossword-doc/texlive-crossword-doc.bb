SUMMARY = "Documentation for texlive-crossword"
DESCRIPTION = "This package includes the documentation for texlive-crossword"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn64375"

RPM_NAME = "texlive-crossword-doc-2023.209.1.11svn64375-55.1.noarch.rpm"
RPM_HASH = "d34f9ef1bae9d5c7449ce1a78f969deacf6a3a7b3bd13e23da422a8aae674abba0da5c2fd7801dd6c348078888ba3705b68d39fffa55ed7528a22c5c2d8be215"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crossword-doc"

RDEPENDS:${PN} += ""

inherit rpm
