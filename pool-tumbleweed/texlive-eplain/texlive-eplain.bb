SUMMARY = "Extended plain TeX macros"
DESCRIPTION = "An extended version of the plain TeX format, adding support for \
bibliographies, tables of contents, enumerated lists, verbatim \
input of files, numbered equations, tables, two-column output, \
footnotes, hyperlinks in PDF output and commutative diagrams. \
Eplain can also load some of the more useful LaTeX packages, \
notably graphics, graphicx (an extended version of graphics), \
color, autopict (a package instance of the LaTeX picture code), \
psfrag, and url."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.13svn64721"

RPM_NAME = "texlive-eplain-2023.209.3.13svn64721-54.2.noarch.rpm"
RPM_HASH = "6ed33dd67f2e02b0107470ff4cdda528dd068b49666935664956875e7cf05498f7fa8ab800d045df9610d9f38ac6b531fb85646faf3a92ede938be3b6964a63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arrow.tex \
tex-btxmac.tex \
tex-eplain.tex \
texlive-eplain"

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
texlive-eplain-bin \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-fonts \
texlive-pdftex \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex-ini-files \
texlive-unicode-data"

inherit rpm
