SUMMARY = "Piedmontese hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Piedmontese in ASCII encoding. \
Compliant with 'Gramatica dla lengua piemonteisa' by Camillo \
Brero."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-piedmontese-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "746173034f4f41d64b6d365001f5ef3b06ee54e6420612ed0bb7eecb92076946947a92d553bb5e7e5bf9cfbb30a6a705534b0d5ed53bac661d8062136098f2ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pms.tex \
tex-hyph-quote-pms.tex \
tex-loadhyph-pms.tex \
texlive-hyphen-piedmontese"

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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
