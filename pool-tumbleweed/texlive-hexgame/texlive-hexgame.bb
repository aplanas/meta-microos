SUMMARY = "Provide an environment to draw a hexgame-board"
DESCRIPTION = "Hex is a mathematical game invented by the Danish mathematician \
Piet Hein and independently by the mathematician John Nash. \
This package defines an environment that enables the user to \
draw such a game in a trivial way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hexgame-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "76752532087cf5b8a279d72e5426173ead95acd447014d56599d4fb9d2b190b8b329cf139db164e6791f3e90702212c2001c925bc2cfeb65e6163a147c5fb260"
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
