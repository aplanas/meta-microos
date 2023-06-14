SUMMARY = "Unofficial thesis template for Huazhong University"
DESCRIPTION = "The package provides an Unofficial Thesis Template in LaTeX for \
Huazhong University of Science and Technology."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn42547"

RPM_NAME = "texlive-hustthesis-2023.201.1.4svn42547-52.1.noarch.rpm"
RPM_HASH = "29cd754ff1ed2774ab8f626d97b2c5e99abf1baea7f2bf603129d1b0e1c3e355c69766bd20dd7bc3eea6f9aa0ef8c5cbed9ad81d02b6c37072784730321e2fe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hustthesis.cls \
texlive-hustthesis"

RDEPENDS:${PN} += "/bin/sh \
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
