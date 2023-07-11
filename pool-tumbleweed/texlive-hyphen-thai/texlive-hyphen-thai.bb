SUMMARY = "Thai hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Thai in LTH and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-thai-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "2c4dba3d7b4577da86086d00db5d144be4c67a9e3ff12a1e8ebd002c8a32ba252d59989e7b07998eae4c5d36e34f20b887c7ea13d47d3e747cd2625045136848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-th.lth.tex \
tex-hyph-th.tex \
tex-loadhyph-th.tex \
texlive-hyphen-thai"

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
