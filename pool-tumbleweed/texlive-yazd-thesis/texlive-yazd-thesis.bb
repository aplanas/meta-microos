SUMMARY = "A template for the Yazd University"
DESCRIPTION = "This package offers a document class for typesetting theses and \
dissertations at the Yazd University. The class requires use of \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-2023.209.0.0.3svn61719-53.1.noarch.rpm"
RPM_HASH = "d33e739c5d087c320e30462af4c160f3d33313a2058e408d0396deaf37eb8873560896f45fdd4688d6639233755ec5d18961da903e24dad0d1187ae9b2ab9b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yazd-thesis.cls \
texlive-yazd-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-array.sty \
tex-book.cls \
tex-calc.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-makeidx.sty \
tex-multicol.sty \
tex-tocbibind.sty \
tex-xcolor.sty \
tex-zref-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
