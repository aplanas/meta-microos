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

PV = "2023.201.4.34asvn61719"

RPM_NAME = "texlive-pst-solides3d-2023.201.4.34asvn61719-53.2.noarch.rpm"
RPM_HASH = "a81bc741ad7ae536f3761b11f0bf59f66d44ca80c8583ebc4d1c0c95c121bb8bc785df4a93425c9254e49516b8ecb824b005f490cac82b393386ff57fbebbcc5"
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
