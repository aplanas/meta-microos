SUMMARY = "Polish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Polish in QX and UTF-8 encodings. \
These patterns are also used by Polish TeX formats MeX and \
LaMeX."
LICENSE = "SUSE-TeX"

PV = "2023.209.3.0bsvn58609"

RPM_NAME = "texlive-hyphen-polish-2023.209.3.0bsvn58609-54.1.noarch.rpm"
RPM_HASH = "60ba40eb2ff04cc038da94beb6b6a776555a9d5516a8be8a63afde146349f97ad129174a82e97da5f4b9f85f26fa2c71cbf9cc0fa82771d251ea1331d07185ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-pl.qx.tex \
tex-hyph-pl.tex \
tex-loadhyph-pl.tex \
texlive-hyphen-polish"

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
