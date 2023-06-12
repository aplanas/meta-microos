SUMMARY = "Coptic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Coptic in UTF-8 encoding as well as in \
ASCII-based encoding for 8-bit engines. The latter can only be \
used with special Coptic fonts (like CBcoptic). The patterns \
are considered experimental."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-coptic-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "5259caf509b71865e6f964ff247e987c9405b4d5ced872db3a92ee7b5acdbffbfece3f27f3b586e227102502df9c263252bab63cf8c14c68440c7c914c87a200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(copthyph.tex) \
tex(hyph-cop.tex) \
tex(loadhyph-cop.tex) \
texlive-hyphen-coptic"
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
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
