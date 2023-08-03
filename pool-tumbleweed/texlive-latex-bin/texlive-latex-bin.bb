SUMMARY = "LaTeX executables and man pages"
DESCRIPTION = "The latex-bin package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-latex-bin-2023.209.svn66186-56.1.noarch.rpm"
RPM_HASH = "1a165411b09d0859e6f48eccfe177ad4f28766006756f54add8c91bd3af1cc89b1a98a35515cdfe7b39340ad77ebe43addfb8477b8200f314594f31f57fc7b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvilualatex.1 \
man-latex.1 \
man-lualatex.1 \
man-pdflatex.1 \
texlive-latex-bin"

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
texlive-amsfonts \
texlive-atbegshi \
texlive-atveryend \
texlive-babel \
texlive-cm \
texlive-cm-super \
texlive-dehyph \
texlive-dehyph-exptl \
texlive-ec \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-graphics \
texlive-graphics-def \
texlive-hyph-utf8 \
texlive-hyphen-ancientgreek \
texlive-hyphen-base \
texlive-hyphen-german \
texlive-hyphen-greek \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-bin-bin \
texlive-latex-fonts \
texlive-latexconfig \
texlive-lm \
texlive-luahbtex \
texlive-luaotfload \
texlive-luatex \
texlive-pdftex \
texlive-ruhyphen \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-ukrhyph \
texlive-unicode-data"

inherit rpm
