SUMMARY = "Documentation for texlive-oinuit"
DESCRIPTION = "This package includes the documentation for texlive-oinuit"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28668"

RPM_NAME = "texlive-oinuit-doc-2023.209.svn28668-55.1.noarch.rpm"
RPM_HASH = "ba4d3705a0ac03211bf1f2d2ea5274bdbaaed980541b313210a3d71bfe9e77ea062384399ab5653ef60d7a9dcbaf435b2d13e02e9e1c7eac2886c79463e90432"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oinuit-doc"

RDEPENDS:${PN} += ""

inherit rpm
