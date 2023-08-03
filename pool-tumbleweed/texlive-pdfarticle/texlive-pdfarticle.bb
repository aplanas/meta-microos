SUMMARY = "Class for pdf publications"
DESCRIPTION = "pdfArticle is simple document class dedicated for creating pdf \
documents with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51127"

RPM_NAME = "texlive-pdfarticle-2023.209.1.0svn51127-52.1.noarch.rpm"
RPM_HASH = "637ccdc59254a8cf0e741d9d37341c5accb496c42f75aa7e8116f96040314164c5c6d8fb4743c82bc43ab55f5597b2f78d30317ced2c19432cf2a401769566c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfArticle.cls \
texlive-pdfarticle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-alphalph.sty \
tex-amsmath.sty \
tex-array.sty \
tex-changepage.sty \
tex-contour.sty \
tex-dcolumn.sty \
tex-enumitem.sty \
tex-extarticle.cls \
tex-fancyvrb.sty \
tex-fifo-stack.sty \
tex-fontspec.sty \
tex-fvextra.sty \
tex-geometry.sty \
tex-graphbox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-minted.sty \
tex-overpic.sty \
tex-pbox.sty \
tex-ragged2e.sty \
tex-setspace.sty \
tex-shadowtext.sty \
tex-tabto.sty \
tex-tcolorbox.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-varwidth.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
