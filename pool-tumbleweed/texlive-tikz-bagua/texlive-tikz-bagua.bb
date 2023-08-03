SUMMARY = "Draw Bagua symbols in Yijing"
DESCRIPTION = "This package provides commands for drawing symbols in Yijing (I \
Ching) or Zhouyi using TikZ. There is no need for extra special \
fonts for showing these symbols. The package relies on TikZ, \
bitset, xintexpr, xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn64103"

RPM_NAME = "texlive-tikz-bagua-2023.209.1.01svn64103-55.1.noarch.rpm"
RPM_HASH = "7cfaaa7b7d57564b6925777415dad7ed9c72f54cb1bad9e86e235eb7ec38cceb4f78abc2b60381e3d683a0ef16fbc1c8ab0573fd9a9dd1c15626135effdbc8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-bagua.sty \
texlive-tikz-bagua"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bitset.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
