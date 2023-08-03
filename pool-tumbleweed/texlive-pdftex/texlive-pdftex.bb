SUMMARY = "A TeX extension for direct creation of PDF"
DESCRIPTION = "An extension of TeX which can directly generate PDF documents \
as well as DVI output. All current free TeX distributions \
including TeX Live, MacTeX and MiKTeX include pdfTeX (Plain \
TeX) and pdfLaTeX (LaTeX), among many other formats based on \
the pdfTeX engine."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66243"

RPM_NAME = "texlive-pdftex-2023.209.svn66243-52.1.noarch.rpm"
RPM_HASH = "38142135ee1273785921e2877ac1bf66fa132709c58a8d42a5367ddd3a12ea6b2367dec82cd5eac8ba8e7c4a2d5441c8220556b1e13b39f1d8eef3298af8d3a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dummy-space.map \
tex-dummy-space.tfm \
tex-glyphtounicode.tex \
tex-pdfcolor.tex \
tex-pdftex-dvi.tex \
tex-pdftexspace.tfm \
texlive-pdftex"

RDEPENDS:${PN} += "/usr/bin/sh \
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
