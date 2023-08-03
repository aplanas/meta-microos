SUMMARY = "Radboud University Titlepage Package"
DESCRIPTION = "This is an unofficial LaTeX package to generate titlepages for \
the Radboud University, Nijmegen. It uses official vector logos \
from the university. This package requires the following other \
LaTeX packages: geometry, graphicx, ifpdf, keyval, iflang, and, \
optionnaly, babel-dutch."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn62143"

RPM_NAME = "texlive-rutitlepage-2023.209.3.0svn62143-54.1.noarch.rpm"
RPM_HASH = "bc77836334b3c5d1f83b28e3ad1c6af09f3d23e03c1a208bffcceff3ae57c6bf5ceff2b12253751135c88647f2c6c22e16235e612bba15769c0a9de7238bde7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rutitlepage.sty \
texlive-rutitlepage"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-ifpdf.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
