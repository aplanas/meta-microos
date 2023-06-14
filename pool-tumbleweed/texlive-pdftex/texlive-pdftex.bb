SUMMARY = "A TeX extension for direct creation of PDF"
DESCRIPTION = "An extension of TeX which can directly generate PDF documents \
as well as DVI output. All current free TeX distributions \
including TeX Live, MacTeX and MiKTeX include pdfTeX (Plain \
TeX) and pdfLaTeX (LaTeX), among many other formats based on \
the pdfTeX engine."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn66243"

RPM_NAME = "texlive-pdftex-2023.201.svn66243-51.1.noarch.rpm"
RPM_HASH = "87c6c8ddf0f3716c5385f03dccf37c0abd7925ea9e66d6f4e547f69ce1a24675b29cbff390e8df00efedcd5f5d649f4880bb1576e78cf77fe3c16f1c83799fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dummy-space.map \
tex-dummy-space.tfm \
tex-glyphtounicode.tex \
tex-pdfcolor.tex \
tex-pdftex-dvi.tex \
tex-pdftexspace.tfm \
texlive-pdftex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-load-unicode-data.tex \
tex-pdftexconfig.tex \
tex-updmap.cfg \
texlive \
texlive-cm \
texlive-dehyph \
texlive-etex \
texlive-filesystem \
texlive-graphics-def \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pdftex-bin \
texlive-pdftex-fonts \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files"

inherit rpm
