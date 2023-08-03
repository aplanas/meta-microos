SUMMARY = "Documentation for texlive-biblatex2bibitem"
DESCRIPTION = "This package includes the documentation for texlive-biblatex2bibitem"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.2svn61648"

RPM_NAME = "texlive-biblatex2bibitem-doc-2023.209.0.0.2.2svn61648-54.1.noarch.rpm"
RPM_HASH = "0a799c467501d573807f51f15fe0dd85674588fb950f28b6838a46c2a6e9e45de8eb0742366f7c2f276058a8d8fdb917a5ceb05a60f3b920b44bf1c59b976493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex2bibitem-doc"

RDEPENDS:${PN} += ""

inherit rpm
