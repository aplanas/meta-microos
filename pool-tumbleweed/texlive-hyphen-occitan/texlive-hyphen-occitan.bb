SUMMARY = "Occitan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Occitan in T1/EC and UTF-8 encodings. \
They are supposed to be valid for all the Occitan variants \
spoken and written in the wide area called 'Occitanie' by the \
French. It ranges from the Val d'Aran within Catalunya, to the \
South Western Italian Alps encompassing the southern half of \
the French pentagon."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-occitan-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "4deb8c3111d72a4204a147b644da4583e9c76ba1357297f08808228f3f1e3574c6f31944ab8777ae4be0cbc424fd081079397b526f9c07876959538d95010fe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-oc.ec.tex \
tex-hyph-oc.tex \
tex-hyph-quote-oc.tex \
tex-loadhyph-oc.tex \
texlive-hyphen-occitan"

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
