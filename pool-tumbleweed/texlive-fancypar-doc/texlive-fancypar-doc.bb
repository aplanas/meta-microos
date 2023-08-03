SUMMARY = "Documentation for texlive-fancypar"
DESCRIPTION = "This package includes the documentation for texlive-fancypar"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn58895"

RPM_NAME = "texlive-fancypar-doc-2023.209.1.3svn58895-53.1.noarch.rpm"
RPM_HASH = "1aa35eaca758b09735bf96072700add2108f2105710bda319cfefd0cbfe714e0ac03669070c1539477c310efe4246363b88378bd1eb17d87a0517d8ed3fde4e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancypar-doc"

RDEPENDS:${PN} += ""

inherit rpm
