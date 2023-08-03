SUMMARY = "LaTeX thesis template for Fudan University"
DESCRIPTION = "This package is a LaTeX thesis template package for Fudan \
University. It can make it easy to write theses both in Chinese \
and English."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn66188"

RPM_NAME = "texlive-fduthesis-2023.209.0.0.9svn66188-53.1.noarch.rpm"
RPM_HASH = "58f123d452ab83c4547e3f370e57a8f77df60c629dd83ef76f08d5fe60b33f05e0b8b530b6d15fdb5619844805282c150a3e5993b1507ccf5f84bd516205c373"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fdudoc.cls \
tex-fdulogo.sty \
tex-fduthesis-en.cls \
tex-fduthesis.cls \
tex-fduthesis.def \
texlive-fduthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
tex-ctex.sty \
tex-gbt7714.sty \
tex-hyperref.sty \
tex-l3doc.cls \
tex-l3keys2e.sty \
tex-luatex85.sty \
tex-natbib.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
