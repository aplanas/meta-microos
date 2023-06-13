SUMMARY = "Draw Bagua symbols in Yijing"
DESCRIPTION = "This package provides commands for drawing symbols in Yijing (I \
Ching) or Zhouyi using TikZ. There is no need for extra special \
fonts for showing these symbols. The package relies on TikZ, \
bitset, xintexpr, xparse, and xstring."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn64103"

RPM_NAME = "texlive-tikz-bagua-2023.201.1.01svn64103-54.1.noarch.rpm"
RPM_HASH = "ca94d0ca1fd09fa91c3e6f0537c395dfd7bb53561af7fe650f3a30e4f0ff86897cea125d0188dd1b09b738497fa72ffbb808e822eac1a94e33835670999b0ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tikz-bagua.sty) \
texlive-tikz-bagua"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(bitset.sty) \
tex(tikz.sty) \
tex(xintexpr.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
