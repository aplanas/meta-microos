SUMMARY = "Documentation for texlive-phfquotetext"
DESCRIPTION = "This package includes the documentation for texlive-phfquotetext"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn41869"

RPM_NAME = "texlive-phfquotetext-doc-2023.201.1.0svn41869-51.1.noarch.rpm"
RPM_HASH = "54e39a081cb9fc29e0da423f6806745375cd155dc627c2054b59ee210345f88e46a81929df1eec12806e53dacd0cb44b26bd7d6de38c30f6727ef646c0a17fda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfquotetext-doc"

RDEPENDS:${PN} += ""

inherit rpm
