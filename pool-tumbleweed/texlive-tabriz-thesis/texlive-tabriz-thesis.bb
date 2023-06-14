SUMMARY = "A template for the University of Tabriz"
DESCRIPTION = "The package offers a document class for typesetting theses and \
dissertations at the University of Tabriz. The class requires \
use of XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn51729"

RPM_NAME = "texlive-tabriz-thesis-2023.201.1.1svn51729-54.1.noarch.rpm"
RPM_HASH = "36b9a023af6232994c32c0d7cb366c1c3d1ea86a8526d945614de9a96725f7f4767e5307385f0b5e7ec750400e6319dc7ec5ff9bf579c124b334a480bb3651a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tabriz-thesis.cls \
texlive-tabriz-thesis"

RDEPENDS:${PN} += "/bin/sh \
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
