SUMMARY = "Thesis style of the University of Qom, Iran"
DESCRIPTION = "This package provides a class file for writing theses and \
dissertations according to the University of Qom Graduate \
Schools's guidelines for the electronic submission of master \
theses and PhD dissertations. The class should meet all the \
current requirements and is updated whenever the university \
guidelines change. The class needs XeLaTeX in conjunction with \
the following fonts: XB Niloofar, IranNastaliq, IRlotus, XB \
Zar, XB Titre, and Yas."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn63524"

RPM_NAME = "texlive-thesis-qom-2023.209.0.0.5svn63524-55.1.noarch.rpm"
RPM_HASH = "1ef16fb85609abd710a3e98b792693c2ce45277196c82f4e85ed754c18a8fc5a8f304643d7522fa86b1fb198499e0708604e367aa3a88c780802a1e1aa431028"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thesis-qom.cls \
texlive-thesis-qom"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-apptools.sty \
tex-array.sty \
tex-bidi-atbegshi.sty \
tex-biditools.sty \
tex-book.cls \
tex-booktabs.sty \
tex-emptypage.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-keyval.sty \
tex-makeidx.sty \
tex-multicol.sty \
tex-picture.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xepersian.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
