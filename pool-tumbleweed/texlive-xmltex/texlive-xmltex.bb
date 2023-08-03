SUMMARY = "Support for parsing XML documents"
DESCRIPTION = "The package provides an implementation of a parser for \
documents matching the XML 1.0 and XML Namespace \
Recommendations. In addition to parsing commands are provided \
to attatch TeX typesetting instructions to the various markup \
elemenets as they are encounted. Sample files for typesetting a \
subset of TEI, MathML, are included. Element and Attribute \
names, as well as character data, may use any characters \
allowed in XML, using UTF-8 or a suitable 8-bit encoding."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn62145"

RPM_NAME = "texlive-xmltex-2023.209.0.0.8svn62145-53.1.noarch.rpm"
RPM_HASH = "7c9d86f79d99e39ee4e8f1fdf8b09971c7ed474cf59134d2ea7fc7008d3d7e5269321e0c21a23d6344fd711d435d219566903184335c3c689c3f3bf77bf7452b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xmltex.cfg \
tex-xmltex.tex \
texlive-xmltex"

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
texlive-latex-fonts \
texlive-latexconfig \
texlive-pdftex \
texlive-scripts \
texlive-scripts-bin \
texlive-tex \
texlive-tex-ini-files \
texlive-unicode-data \
texlive-xmltex-bin \
texlive-xmltexconfig"

inherit rpm
