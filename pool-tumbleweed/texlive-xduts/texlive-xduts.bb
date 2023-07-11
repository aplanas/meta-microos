SUMMARY = "Xidian University TeX Suite"
DESCRIPTION = "XDUTS is designed to help Xidian University students use LaTeX \
typesetting efficiently. XDUTS contains a font configuration \
package that meets the school's requirements and can be applied \
to any document class. In addition, there are thesis and thesis \
proposal templates for both undergraduate and postgraduate that \
meet the school's requirements."
LICENSE = "LPPL-1.0"

PV = "2023.201.6.1.2.0svn66472"

RPM_NAME = "texlive-xduts-2023.201.6.1.2.0svn66472-52.2.noarch.rpm"
RPM_HASH = "7640ff15572ca4e1f7173fa8e0da0f2dd5c120c5d44dcb63869b6d0458ca8215bc97cb9eefa67cfe39bd2dd639a803974b3a2e4f955c68ee535175d7d245f729"
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
