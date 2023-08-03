SUMMARY = "Provide an environment to draw a hexgame-board"
DESCRIPTION = "Hex is a mathematical game invented by the Danish mathematician \
Piet Hein and independently by the mathematician John Nash. \
This package defines an environment that enables the user to \
draw such a game in a trivial way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hexgame-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "593c43ee7ad3393a96fc3f63c4d1b965ca4af42e8ef5dc007233a093703c91dce0a5d5aecce21bc5a942279321901f761c5e4b14e7c056c17659f358d6dc42f4"
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
