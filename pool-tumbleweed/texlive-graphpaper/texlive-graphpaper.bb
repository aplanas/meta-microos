SUMMARY = "A LaTeX class to generate several types of graph papers"
DESCRIPTION = "Graphpaper is a LaTeX document class which allows to print \
several types of graph papers: bilinear (millimeter paper), \
semilogarithmic, bilogarithmic, polar, log-polar, Smith charts. \
It is based on the picture environment and its extensions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63116"

RPM_NAME = "texlive-graphpaper-2023.209.1.1svn63116-54.1.noarch.rpm"
RPM_HASH = "25b3f11f20620a549e0cad8189fc35281586d9e47585563772911f1c2af2da1cd48397092e2c534fe34a4f9668f3ce1d4a26599b5bf4352fb10a61dc900bb0cc"
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
