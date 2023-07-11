SUMMARY = "Danish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Danish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-danish-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "6066f74b9f660fce60d41c3882d161b7ba5aa1e5f52e54a854738591012f30aa3615208bd87226dd7bfe5cb95cf2d6cfc0cf3ee13adf29c6c2fcea6351ea831c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-da.ec.tex \
tex-hyph-da.tex \
tex-loadhyph-da.tex \
texlive-hyphen-danish"

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
