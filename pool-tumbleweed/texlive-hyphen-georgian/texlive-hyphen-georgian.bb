SUMMARY = "Georgian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Georgian in T8M, T8K and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-georgian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "e2bcb4c372fcb18a56b5b7c22952ecfd1232ab0f4a00ce432afbaa5851a69411a101fe2c85f3f04d99be4a9f8810e2357b4e379b0c96b0b316c229683c10c8f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ka.t8m.tex \
tex-hyph-ka.tex \
tex-loadhyph-ka.tex \
texlive-hyphen-georgian"

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
