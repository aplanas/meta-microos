SUMMARY = "A LaTeX class to generate several types of graph papers"
DESCRIPTION = "Graphpaper is a LaTeX document class which allows to print \
several types of graph papers: bilinear (millimeter paper), \
semilogarithmic, bilogarithmic, polar, log-polar, Smith charts. \
It is based on the picture environment and its extensions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63116"

RPM_NAME = "texlive-graphpaper-2023.209.1.1svn63116-54.2.noarch.rpm"
RPM_HASH = "23e7c735ccf178bbda4cb701dfadbd11b3c16c7bb5be6e9e763a5e634fd9a91c632ad8914ad5aa4d521e9566cc39713c4b3045c68f85724c23e991239fdfe1f6"
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
