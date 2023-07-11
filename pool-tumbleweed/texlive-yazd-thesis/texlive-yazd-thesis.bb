SUMMARY = "A template for the Yazd University"
DESCRIPTION = "This package offers a document class for typesetting theses and \
dissertations at the Yazd University. The class requires use of \
XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-2023.201.0.0.3svn61719-52.2.noarch.rpm"
RPM_HASH = "bc54a34ef7ff409f397f1da4ba18533a8cea9653cec290d9c5099d0c22cc0c85324985e6f1a7b821697bbcf8373988c93c65456b19da69076c67b17855923e6c"
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
