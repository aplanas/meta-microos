SUMMARY = "Class for newspapers, etcetera"
DESCRIPTION = "This class allows LaTeX users to create a paperTeX newspaper. \
The final document has a front page and as many inner pages as \
desired. News items appear one after another and the user can \
choose the number of columns, style and so on. The class allows \
users to create newsletters too."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn19230"

RPM_NAME = "texlive-papertex-2023.209.1.2bsvn19230-52.1.noarch.rpm"
RPM_HASH = "51e4a0bd2d441d55b1561b3849a98f5bc53bc5ea10d3d886be7f0e4d4ab153554acb4ee143a710cab0e4112cce5233cf01596294288e9d23d58179e642aed1bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-papertex.cls \
texlive-papertex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-color.sty \
tex-datetime.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-lastpage.sty \
tex-multicol.sty \
tex-multido.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-textpos.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
