SUMMARY = "Unofficial thesis template for Huazhong University"
DESCRIPTION = "The package provides an Unofficial Thesis Template in LaTeX for \
Huazhong University of Science and Technology."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn42547"

RPM_NAME = "texlive-hustthesis-2023.209.1.4svn42547-54.1.noarch.rpm"
RPM_HASH = "f5619ac395e1ff763e46c822309fd7cd0a7ef2c7d76d06c2a49d203c589fb602cdd44c3216911a368aa15ed6b9c4ca657c3bf4cfb259c0333225b51023e262c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hustthesis.cls \
texlive-hustthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-algorithm2e.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-appendix.sty \
tex-array.sty \
tex-book.cls \
tex-caption.sty \
tex-color.sty \
tex-datenumber.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fancynum.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-listings.sty \
tex-ltxtable.sty \
tex-luatexja-fontspec.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-ntheorem.sty \
tex-overpic.sty \
tex-perpage.sty \
tex-subcaption.sty \
tex-tabularx.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-tocloft.sty \
tex-tocvsec2.sty \
tex-xcolor.sty \
tex-xeCJK.sty \
tex-xkeyval.sty \
tex-xstring.sty \
tex-xunicode.sty \
tex-zhnumber.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
