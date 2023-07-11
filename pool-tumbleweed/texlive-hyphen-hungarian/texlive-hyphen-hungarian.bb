SUMMARY = "Hungarian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Hungarian in T1/EC and UTF-8 \
encodings."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-hungarian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "c383ba42f83e1089d4c8278412d29b752dfb3d2e34cb2e55376b0cf4051610aba2772b501104d930a71c4dc088b3654f542a4507cbe1cb25391f6a7a23e2a752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hu.ec.tex \
tex-hyph-hu.tex \
tex-loadhyph-hu.tex \
texlive-hyphen-hungarian"

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
