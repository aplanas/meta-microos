SUMMARY = "Occitan hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Occitan in T1/EC and UTF-8 encodings. \
They are supposed to be valid for all the Occitan variants \
spoken and written in the wide area called 'Occitanie' by the \
French. It ranges from the Val d'Aran within Catalunya, to the \
South Western Italian Alps encompassing the southern half of \
the French pentagon."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-occitan-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "4dd6946f0156974f53f5b19c3f48033405c50927fa800eb5441d717284af02054482528e7dbd052a9a4f5825a07a75332e8922066f222ccd40cee24c170760e0"
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
