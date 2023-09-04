SUMMARY = "A template for the Yazd University"
DESCRIPTION = "This package offers a document class for typesetting theses and \
dissertations at the Yazd University. The class requires use of \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-2023.209.0.0.3svn61719-53.2.noarch.rpm"
RPM_HASH = "0e8c10e19da348a75b9ab823054f179a45bc313fc49d7a43f4a94c50c5d9f7e2dd32b2eb0d8171a67d7afeb89f60c78199e9b4e315763516fc9491bc044ec732"
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
