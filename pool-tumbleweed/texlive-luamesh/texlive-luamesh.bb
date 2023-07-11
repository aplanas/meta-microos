SUMMARY = "Computes and draws 2D Delaunay triangulation"
DESCRIPTION = "The package allows to compute and draw 2D Delaunay \
triangulation. The algorithm is written with lua, and depending \
upon the choice of the engine, the drawing is done by MetaPost \
(with luamplib) or by TikZ. The Delaunay triangulation \
algorithm is the Bowyer and Watson algorithm. Several macros \
are provided to draw the global mesh, the set of points, or a \
particular step of the algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.7svn63875"

RPM_NAME = "texlive-luamesh-2023.208.0.0.7svn63875-53.1.noarch.rpm"
RPM_HASH = "164ab51605690d84ed489e31ddd197f75e575722cadc982c753f81a68605839bc8da149373c06d9fda5c401a54f7ed39e4201c5248793c42dd4d1ff2bdfb1225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luamesh.sty \
texlive-luamesh"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-luamplib.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
