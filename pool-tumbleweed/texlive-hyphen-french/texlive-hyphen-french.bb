SUMMARY = "French hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for French in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-french-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "358aa29adcdc9f323305f71cf9aa9ff603c7454232755955224667139e3f662c80354a9de5174adaa6e71f223f977215bab9402fc9ef3f9960df64a9c1b10e29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fr.ec.tex \
tex-hyph-fr.tex \
tex-hyph-quote-fr.tex \
tex-loadhyph-fr.tex \
texlive-hyphen-french"

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
