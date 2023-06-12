SUMMARY = "Xidian University TeX Suite"
DESCRIPTION = "XDUTS is designed to help Xidian University students use LaTeX \
typesetting efficiently. XDUTS contains a font configuration \
package that meets the school's requirements and can be applied \
to any document class. In addition, there are thesis and thesis \
proposal templates for both undergraduate and postgraduate that \
meet the school's requirements."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1.2.0svn66472"

RPM_NAME = "texlive-xduts-2023.201.6.1.2.0svn66472-52.1.noarch.rpm"
RPM_HASH = "e9b19da4abc471db77dd382a231c85e5bd94322f9d96e7e8b1bbf87b545556ed35518203293751f85deed5b270674589351d51cf75f3227c0bbbfe237ea61011"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xdufont.sty) \
tex(xdupgthesis.cls) \
tex(xduugthesis.cls) \
tex(xduugtp.cls) \
texlive-xduts"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(bibentry.sty) \
tex(biblatex.sty) \
tex(caption.sty) \
tex(enumitem.sty) \
tex(expl3.sty) \
tex(fancyhdr.sty) \
tex(gbt7714.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(l3keys2e.sty) \
tex(tabularray.sty) \
tex(tcolorbox.sty) \
tex(tocloft.sty) \
tex(unicode-math.sty) \
tex(xeCJK.sty) \
tex(xeCJKfntef.sty) \
tex(xparse.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
