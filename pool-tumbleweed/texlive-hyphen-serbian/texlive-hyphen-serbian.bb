SUMMARY = "Serbian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Serbian in T1/EC, T2A and UTF-8 \
encodings. For 8-bit engines the patterns are available \
separately as 'serbian' in T1/EC encoding for Latin script and \
'serbianc' in T2A encoding for Cyrillic script. Unicode engines \
should only use 'serbian' which has patterns in both scripts \
combined."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0asvn58609"

RPM_NAME = "texlive-hyphen-serbian-2023.201.1.0asvn58609-52.1.noarch.rpm"
RPM_HASH = "c1163537ebe365e6ba210e8de5a1ab47ddf0d3fb41d58e0012c9013e68714cb90df63c7cfa5bb94406fdd9ef3ad1bf8f363e75b2cb9f58ef21764bbdd23a3852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sh-cyrl.t2a.tex \
tex-hyph-sh-cyrl.tex \
tex-hyph-sh-latn.ec.tex \
tex-hyph-sh-latn.tex \
tex-hyph-sr-cyrl.tex \
tex-loadhyph-sr-cyrl.tex \
tex-loadhyph-sr-latn.tex \
texlive-hyphen-serbian"

RDEPENDS:${PN} += "/bin/sh \
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
