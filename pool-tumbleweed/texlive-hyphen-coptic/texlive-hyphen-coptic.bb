SUMMARY = "Coptic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Coptic in UTF-8 encoding as well as in \
ASCII-based encoding for 8-bit engines. The latter can only be \
used with special Coptic fonts (like CBcoptic). The patterns \
are considered experimental."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-coptic-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "f7c4e0397d4e8bbbcfa0c09be68e5d02bbffe355e4c3109070713f56835c40a12bc527ab825bbb3a2258b72153f2211e922eca59ed36b489893785968e34af97"
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
