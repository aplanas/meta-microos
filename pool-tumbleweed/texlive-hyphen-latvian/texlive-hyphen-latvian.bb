SUMMARY = "Latvian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Latvian in L7X and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-latvian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "750a614b468158c3d0b1a1d49dad1ab2244506768c85836c4695520aec431c64491dabca887ab26127482bce786da4b319a9cda23f1a92718231c3d06071e993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-lv.l7x.tex \
tex-hyph-lv.tex \
tex-loadhyph-lv.tex \
texlive-hyphen-latvian"

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
