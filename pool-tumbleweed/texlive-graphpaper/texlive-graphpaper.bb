SUMMARY = "A LaTeX class to generate several types of graph papers"
DESCRIPTION = "Graphpaper is a LaTeX document class which allows to print \
several types of graph papers: bilinear (millimeter paper), \
semilogarithmic, bilogarithmic, polar, log-polar, Smith charts. \
It is based on the picture environment and its extensions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63116"

RPM_NAME = "texlive-graphpaper-2023.201.1.1svn63116-53.1.noarch.rpm"
RPM_HASH = "3521792d99b68ae96d7e941da59955fc9ec61786abdf06c9b44676eada310cda12aa6d340e3caa2584482b785373e82f96a9658302e2bdcc5821e289833d130f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(graphpaper.cls) \
texlive-graphpaper"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(euclideangeometry.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
