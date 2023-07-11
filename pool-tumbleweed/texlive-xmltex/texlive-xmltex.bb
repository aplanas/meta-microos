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

PV = "2023.201.0.0.8svn62145"

RPM_NAME = "texlive-xmltex-2023.201.0.0.8svn62145-52.2.noarch.rpm"
RPM_HASH = "9da60223acfa7a3f331c81c0f68fc332f3d26f21e6c98e41642b4f5ad2e956ca83a8eb2c110d71405349cd0f530b22053d08668c0baeefe4d1e042032d597b58"
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
