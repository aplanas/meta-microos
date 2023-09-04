SUMMARY = "Thai hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Thai in LTH and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-thai-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "73e0472676fe44aade97b50d1f73f8be2a2e2877bc82922fc7b6c2234525ca3b8141471500a808ced00e432457ae0b01db6063f4029d629cf01f44194a4836e9"
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
