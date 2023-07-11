SUMMARY = "Provide an environment to draw a hexgame-board"
DESCRIPTION = "Hex is a mathematical game invented by the Danish mathematician \
Piet Hein and independently by the mathematician John Nash. \
This package defines an environment that enables the user to \
draw such a game in a trivial way."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hexgame-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "9605ef23cb5ee58046c6bf55d2b24058e2f78f2ee3aaa612f0ecfabe7570e8d776c8906ccebcbb94628d6dce3074bb7d16d93ece98dc2e743be3a9c61ba43f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hexgame.sty \
texlive-hexgame"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ifthen.sty \
tex-pst-poly.sty \
tex-pstcol.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
