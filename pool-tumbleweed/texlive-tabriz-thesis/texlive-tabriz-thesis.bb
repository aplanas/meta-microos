SUMMARY = "A template for the University of Tabriz"
DESCRIPTION = "The package offers a document class for typesetting theses and \
dissertations at the University of Tabriz. The class requires \
use of XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn51729"

RPM_NAME = "texlive-tabriz-thesis-2023.209.1.1svn51729-55.1.noarch.rpm"
RPM_HASH = "796ee7f7a4a43214d9cf82bc909a4939f7482a1aab756da7b675fea338d606ca4fac319248806a636a41352a2ab8b6e9b5d85312fac4dd202ad8a4ba2a6dc16d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabriz-thesis.cls \
texlive-tabriz-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-book.cls \
tex-fancyhdr.sty \
tex-framed.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-lastpage.sty \
tex-makeidx.sty \
tex-tocbibind.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
