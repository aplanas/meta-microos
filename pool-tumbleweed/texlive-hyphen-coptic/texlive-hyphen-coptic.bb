SUMMARY = "Coptic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Coptic in UTF-8 encoding as well as in \
ASCII-based encoding for 8-bit engines. The latter can only be \
used with special Coptic fonts (like CBcoptic). The patterns \
are considered experimental."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-coptic-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "d64b538ddfcb9cfbfd7fc0529f910f0f9bdc8053241c45279db32c8f8f12cbeeeda3f1183b8a0d8a1bf4a1a0ae48f8bb98e54c67fbccf4080f232cf5a606b10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-copthyph.tex \
tex-hyph-cop.tex \
tex-loadhyph-cop.tex \
texlive-hyphen-coptic"

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
