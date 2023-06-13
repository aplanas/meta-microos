SUMMARY = "Polish formats for TeX"
DESCRIPTION = "MeX is an adaptation of Plain TeX (MeX) and LaTeX209 (LaMeX) \
formats to the Polish language and to Polish printing customs. \
It contains a complete set of Metafont sources of Polish fonts, \
hyphenation rules for the Polish language and sources of \
formats."
LICENSE = "SUSE-TeX"

PV = "2023.201.1.05asvn58661"

RPM_NAME = "texlive-mex-2023.201.1.05asvn58661-54.1.noarch.rpm"
RPM_HASH = "471c1445badab8f6b7b25ab11027f0cab9cd1a642478796784a989ab51738243db92f7b80f4fe5bc4602ab215e98f368c945588bc12ba9e6c82416fc62c28fa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-mex) \
tex(lamex.tex) \
tex(mex.tex) \
tex(mex1.tex) \
tex(mex2.tex) \
tex(mexconf.tex) \
texlive-mex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
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
