SUMMARY = "Xidian University TeX Suite"
DESCRIPTION = "XDUTS is designed to help Xidian University students use LaTeX \
typesetting efficiently. XDUTS contains a font configuration \
package that meets the school's requirements and can be applied \
to any document class. In addition, there are thesis and thesis \
proposal templates for both undergraduate and postgraduate that \
meet the school's requirements."
LICENSE = "LPPL-1.0"

PV = "2023.209.6.1.2.0svn66472"

RPM_NAME = "texlive-xduts-2023.209.6.1.2.0svn66472-53.2.noarch.rpm"
RPM_HASH = "117eda64c2aeee1231d4aa728c28cdbd1ef00137044e4e8dbcca56a026bffe68c0ab70d0f0f323a47664b2ffb53fed9556c7515c9fa429b6d4a603f649ccbe85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xdufont.sty \
tex-xdupgthesis.cls \
tex-xduugthesis.cls \
tex-xduugtp.cls \
texlive-xduts"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bibentry.sty \
tex-biblatex.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-gbt7714.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-l3keys2e.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-tocloft.sty \
tex-unicode-math.sty \
tex-xeCJK.sty \
tex-xeCJKfntef.sty \
tex-xparse.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
