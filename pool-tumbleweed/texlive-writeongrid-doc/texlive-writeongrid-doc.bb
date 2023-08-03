SUMMARY = "Documentation for texlive-writeongrid"
DESCRIPTION = "This package includes the documentation for texlive-writeongrid"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.2svn65700"

RPM_NAME = "texlive-writeongrid-doc-2023.209.0.0.1.2svn65700-53.1.noarch.rpm"
RPM_HASH = "4da6ea8be0ffe910b2873afccfcc975f68ac8ec4913288c3060b8ee3c1ca684b11a17abe6b7a5b6ed761585899dacb0843ffbce58a21951cc149a5ec31045e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-writeongrid-doc-fr \
texlive-writeongrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
