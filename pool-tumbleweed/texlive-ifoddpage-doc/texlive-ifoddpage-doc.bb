SUMMARY = "Documentation for texlive-ifoddpage"
DESCRIPTION = "This package includes the documentation for texlive-ifoddpage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64967"

RPM_NAME = "texlive-ifoddpage-doc-2023.209.1.2svn64967-54.1.noarch.rpm"
RPM_HASH = "5e3cf7839523cb181539f02601026e1f7c8755eba09d1ae80a04a47a62a5b121fe66d3f27bb0c7aac2da0e53258ea798604f720bc15a5c37182aa09e7199aaf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifoddpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
