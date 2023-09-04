SUMMARY = "Bulgarian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Bulgarian in T2A and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58685"

RPM_NAME = "texlive-hyphen-bulgarian-2023.209.svn58685-54.1.noarch.rpm"
RPM_HASH = "ad924b90fc7a9abeb723ab26b6b959a5d044edd45ab1344c45fdb549c443ee50212e7e5bd2eec60f30138367d3e67f77e15d573dac9c56c822b155dbe102bb25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-bg.t2a.tex \
tex-hyph-bg.tex \
tex-loadhyph-bg.tex \
texlive-hyphen-bulgarian"

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
