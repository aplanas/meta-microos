SUMMARY = "Documentation for texlive-zhspacing"
DESCRIPTION = "This package includes the documentation for texlive-zhspacing"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn41145"

RPM_NAME = "texlive-zhspacing-doc-2023.209.svn41145-53.1.noarch.rpm"
RPM_HASH = "5c0d1d32c6c458511ce8269be274ffe38b7d40128fb80f663f608498378a51830efdf11e322e4042880f822626068a252d81eeeef3abf1076a0e118e60ae8427"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zhspacing-doc"

RDEPENDS:${PN} += ""

inherit rpm
