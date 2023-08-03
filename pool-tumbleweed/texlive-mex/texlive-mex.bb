SUMMARY = "Polish formats for TeX"
DESCRIPTION = "MeX is an adaptation of Plain TeX (MeX) and LaTeX209 (LaMeX) \
formats to the Polish language and to Polish printing customs. \
It contains a complete set of Metafont sources of Polish fonts, \
hyphenation rules for the Polish language and sources of \
formats."
LICENSE = "SUSE-TeX"

PV = "2023.209.1.05asvn58661"

RPM_NAME = "texlive-mex-2023.209.1.05asvn58661-55.1.noarch.rpm"
RPM_HASH = "a7daa01bafc12486b5c9a40cdad64246abfe49d2d3336ecb34fab39e93f46c9444c760bed8d0f315a3cb7e76ed223f22aad4ff8d7af32c2a9f2277080f5afc3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-mex \
tex-lamex.tex \
tex-mex.tex \
tex-mex1.tex \
tex-mex2.tex \
tex-mexconf.tex \
texlive-mex"

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
texlive-enctex \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-hyphen-polish \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mex-bin \
texlive-pdftex \
texlive-pl \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex \
texlive-tex-ini-files \
texlive-utf8mex"

inherit rpm
