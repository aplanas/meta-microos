SUMMARY = "Documentation for texlive-bxnewfont"
DESCRIPTION = "This package includes the documentation for texlive-bxnewfont"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn44173"

RPM_NAME = "texlive-bxnewfont-doc-2023.209.0.0.2bsvn44173-53.1.noarch.rpm"
RPM_HASH = "b7721bca309b797e8ea3f5ac3aebbb3cb55da867425556bdc8ca13dbb62ec435b77976df0762862fd4786e73a05cc0ff399ba2dc2f1ede5c0f706d0af99da753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxnewfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
