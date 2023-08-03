SUMMARY = "Draw Bao diagrams"
DESCRIPTION = "The package draws Bao diagrams in LaTeX. The package is a \
development of psgo, and uses PSTricks to draw the diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55013"

RPM_NAME = "texlive-psbao-2023.209.1.0svn55013-53.1.noarch.rpm"
RPM_HASH = "190fdc0e2bed426a464dfc7e45c5586f6cf14244151d073f08e9556ebaa79e1e71e8bfe4b25f2565697e926996541fbba082e07d3a7f7c80712f63fb6aef624b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psbao.sty \
texlive-psbao"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-cool.sty \
tex-etex.sty \
tex-ifthen.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
