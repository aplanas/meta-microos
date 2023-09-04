SUMMARY = "Occitan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Occitan in T1/EC and UTF-8 encodings. \
They are supposed to be valid for all the Occitan variants \
spoken and written in the wide area called 'Occitanie' by the \
French. It ranges from the Val d'Aran within Catalunya, to the \
South Western Italian Alps encompassing the southern half of \
the French pentagon."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-occitan-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "c325894de8611b6452f966fb2b000fbfa92b07be4ff6f0e4a01c63de2a99caee9e7a07607b17a3064ad828792989405f8a5d959359048653b9237119612f69ed"
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
