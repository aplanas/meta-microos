SUMMARY = "Sanskrit hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Sanskrit and Prakrit in \
transliteration, and in Devanagari, Bengali, Kannada, Malayalam \
and Telugu scripts for Unicode engines."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-sanskrit-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "a714699ef467bced28ef5320cb5e5d75928b71ec91b46c37bab2569b8614515dbb3507b150ce92ec73a4444d7eee65b93cd1124a0f9f6dd11c9c747a18000392"
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
