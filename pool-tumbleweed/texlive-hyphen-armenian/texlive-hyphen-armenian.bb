SUMMARY = "Armenian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Armenian for Unicode engines. \
Auto-generated from a script included in hyph-utf8."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-armenian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "903ec6dd16c22a41100f596655b647d11ab0b7d2f30121be4fa835f8d6a58af3f0eb2aa0a2e0682391af6ff2538c33888dafb24c10ad47866f102d3a98dcf6a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hy.tex \
tex-loadhyph-hy.tex \
texlive-hyphen-armenian"

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
