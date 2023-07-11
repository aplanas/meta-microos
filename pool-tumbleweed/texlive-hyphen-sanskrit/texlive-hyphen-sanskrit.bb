SUMMARY = "Sanskrit hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Sanskrit and Prakrit in \
transliteration, and in Devanagari, Bengali, Kannada, Malayalam \
and Telugu scripts for Unicode engines."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-sanskrit-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "32b78aa17cdeb2f367d3ec9aa07f1becd6de260fc179c11c80e5c0203c52cd6f08205ba8f61f2b3c9ddf946209d1e37f1d5b2d932d92588796e22cdfde34e915"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sa.tex \
tex-loadhyph-sa.tex \
texlive-hyphen-sanskrit"

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
