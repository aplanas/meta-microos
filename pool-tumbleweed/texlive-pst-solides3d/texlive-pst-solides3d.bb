SUMMARY = "Draw perspective views of 3D solids"
DESCRIPTION = "The package is designed to draw solids in 3d perspective. \
Features include: create primitive solids; create solids by \
including a list of its vertices and faces; faces of solids and \
surfaces can be colored by choosing from a very large palette \
of colors; draw parametric surfaces in algebraic and reverse \
polish notation; create explicit and parameterized algebraic \
functions drawn in 2 or 3 dimensions; project text onto a plane \
or onto the faces of a solid; support for including external \
database files."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.34asvn61719"

RPM_NAME = "texlive-pst-solides3d-2023.209.4.34asvn61719-54.1.noarch.rpm"
RPM_HASH = "27d80679e308788c6a981b6d6bb833b99551b10c565800574b7f470bd0ac34e3bdddf44d366a199ae3da197852c27e9410f88939a45d5a55c64f9bb1ac276274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-solides3d.sty \
tex-pst-solides3d.tex \
texlive-pst-solides3d"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
