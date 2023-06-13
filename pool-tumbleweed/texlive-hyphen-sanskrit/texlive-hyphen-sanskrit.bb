SUMMARY = "Sanskrit hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Sanskrit and Prakrit in \
transliteration, and in Devanagari, Bengali, Kannada, Malayalam \
and Telugu scripts for Unicode engines."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-sanskrit-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "8eec9cc9cea4945bd977d166b4db32216f7b59f50418cda1d524ea2d19d52546760b00197486108d87e188254e4902f0916ba1e4f8d4edc121604185243c6d42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hyph-sa.tex) \
tex(loadhyph-sa.tex) \
texlive-hyphen-sanskrit"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-filesystem \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
