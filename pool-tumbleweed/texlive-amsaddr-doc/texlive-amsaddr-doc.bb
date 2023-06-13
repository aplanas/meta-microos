SUMMARY = "Documentation for texlive-amsaddr"
DESCRIPTION = "This package includes the documentation for texlive-amsaddr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn64357"

RPM_NAME = "texlive-amsaddr-doc-2023.201.1.2svn64357-54.1.noarch.rpm"
RPM_HASH = "66c18ff199440c0896e6642179aa699b84370b031c5daaef5954859bb7ca76b7498128b1d3d44b26eb3225249c3ad59b2ffb2d00a6f37b0dd324c971fbcee39c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsaddr-doc"

RDEPENDS:${PN} += ""

inherit rpm
