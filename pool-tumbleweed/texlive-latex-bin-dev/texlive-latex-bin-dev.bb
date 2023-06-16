SUMMARY = "LaTeX pre-release executables and formats"
DESCRIPTION = "See the latex-base-dev package for information."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66186"

RPM_NAME = "texlive-latex-bin-dev-2023.201.svn66186-55.1.noarch.rpm"
RPM_HASH = "7dcb5e218bfe36fc2ba289c1e48c73b0f7460352d8f8d618fa92af639a630c3bf65a4ea8c21fbef240b5caeaa4dfa35fc9f4b0b575bb4d0d5ef0808858ebc644"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvilualatex-dev.1 \
man-latex-dev.1 \
man-lualatex-dev.1 \
man-pdflatex-dev.1 \
man-platex-dev.1 \
man-uplatex-dev.1 \
man-xelatex-dev.1 \
texlive-latex-bin-dev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
texlive \
texlive-atbegshi \
texlive-atveryend \
texlive-babel \
texlive-cm \
texlive-dehyph \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-base-dev \
texlive-latex-bin-dev-bin \
texlive-latex-firstaid-dev \
texlive-latex-fonts \
texlive-latex-graphics-dev \
texlive-latexconfig \
texlive-lm \
texlive-luahbtex \
texlive-luaotfload \
texlive-luatex \
texlive-pdftex \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
