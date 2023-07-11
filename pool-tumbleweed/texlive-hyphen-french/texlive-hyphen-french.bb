SUMMARY = "French hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for French in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-french-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "1da1a38bd0a38f28f8f2bbaca1a0ff8ec3e0cf24a8cbbbf090410800898364eed41c8a6b7e19868cb03580b1fc48385d0a7b930a6b3cc93d66b376e69b831a25"
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
