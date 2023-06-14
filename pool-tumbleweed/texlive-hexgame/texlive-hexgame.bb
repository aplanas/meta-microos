SUMMARY = "Provide an environment to draw a hexgame-board"
DESCRIPTION = "Hex is a mathematical game invented by the Danish mathematician \
Piet Hein and independently by the mathematician John Nash. \
This package defines an environment that enables the user to \
draw such a game in a trivial way."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-hexgame-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "4123af0d0a6a9782646799e2cc92a1370aafc59de02dfc7a7e7ef90943193b50a5a7c431065f4cbd7e7c324b9a7f6773fa3e5ab248bf9455f65b6949d13d5ef4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hexgame.sty \
texlive-hexgame"

RDEPENDS:${PN} += "/bin/sh \
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
