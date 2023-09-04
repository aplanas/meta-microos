SUMMARY = "Friulan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Friulan in ASCII encoding. They are \
supposed to comply with the common spelling of the Friulan \
(Furlan) language as fixed by the Regional Law N.15/96 dated \
November 6, 1996 and its following amendments."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-friulan-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "1227f1bbc1890e7798bb45f7fd130b4e69aba9f56a016720355cb27daf7b82eb79f08490deb5bcff4b7168a73e9058e0d513f549844a036c0876618cae57403d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-fur.ec.tex \
tex-hyph-fur.tex \
tex-hyph-quote-fur.tex \
tex-loadhyph-fur.tex \
texlive-hyphen-friulan"

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
