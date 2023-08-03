SUMMARY = "LaTeX pre-release executables and formats"
DESCRIPTION = "See the latex-base-dev package for information."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-latex-bin-dev-2023.209.svn66186-56.1.noarch.rpm"
RPM_HASH = "7449f471091400bf8d46e9f3c8fa05ecc9efdf11ce5da98b9292eec2f6350e09f697fc7b6ade62faf9d9c514d4dec53dd23a67ca7e423bb3892af01f0d4687b8"
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
