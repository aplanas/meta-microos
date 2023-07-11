SUMMARY = "A LaTeX class to generate several types of graph papers"
DESCRIPTION = "Graphpaper is a LaTeX document class which allows to print \
several types of graph papers: bilinear (millimeter paper), \
semilogarithmic, bilogarithmic, polar, log-polar, Smith charts. \
It is based on the picture environment and its extensions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63116"

RPM_NAME = "texlive-graphpaper-2023.201.1.1svn63116-53.2.noarch.rpm"
RPM_HASH = "920c521ec28ab4b1772234c1b484d0947295f43b16c86db179d179cc28aea087993acb823a4f924e80287f0b8470bc52b0e6adf18c16826f7b9719f5dda5091a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graphpaper.cls \
texlive-graphpaper"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-euclideangeometry.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
