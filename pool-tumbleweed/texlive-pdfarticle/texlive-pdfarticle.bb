SUMMARY = "Class for pdf publications"
DESCRIPTION = "pdfArticle is simple document class dedicated for creating pdf \
documents with LuaLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51127"

RPM_NAME = "texlive-pdfarticle-2023.201.1.0svn51127-51.1.noarch.rpm"
RPM_HASH = "02e445c5865ecb40fc6fb4f1aae5d487e972ed3fd0cc4f285b3c7f965b184e75b80221dbae1afc61195a40c223a9729f26705023a2a3f724be5b8d4882c5366f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfArticle.cls) \
texlive-pdfarticle"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(adjustbox.sty) \
tex(alphalph.sty) \
tex(amsmath.sty) \
tex(array.sty) \
tex(changepage.sty) \
tex(contour.sty) \
tex(dcolumn.sty) \
tex(enumitem.sty) \
tex(extarticle.cls) \
tex(fancyvrb.sty) \
tex(fifo-stack.sty) \
tex(fontspec.sty) \
tex(fvextra.sty) \
tex(geometry.sty) \
tex(graphbox.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(kvoptions.sty) \
tex(minted.sty) \
tex(overpic.sty) \
tex(pbox.sty) \
tex(ragged2e.sty) \
tex(setspace.sty) \
tex(shadowtext.sty) \
tex(tabto.sty) \
tex(tcolorbox.sty) \
tex(ulem.sty) \
tex(unicode-math.sty) \
tex(varwidth.sty) \
tex(wrapfig.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
