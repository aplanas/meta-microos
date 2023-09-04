SUMMARY = "Serbian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Serbian in T1/EC, T2A and UTF-8 \
encodings. For 8-bit engines the patterns are available \
separately as 'serbian' in T1/EC encoding for Latin script and \
'serbianc' in T2A encoding for Cyrillic script. Unicode engines \
should only use 'serbian' which has patterns in both scripts \
combined."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0asvn58609"

RPM_NAME = "texlive-hyphen-serbian-2023.209.1.0asvn58609-54.1.noarch.rpm"
RPM_HASH = "859a142db48661573d422b49a35bac067beb2037bba4be013d0da6da2db784cbf8cd2602bba397aa02ba48cb8d273ca845fb908d06a1e200586afe56fc5d6fdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sh-cyrl.t2a.tex \
tex-hyph-sh-cyrl.tex \
tex-hyph-sh-latn.ec.tex \
tex-hyph-sh-latn.tex \
tex-hyph-sr-cyrl.tex \
tex-loadhyph-sr-cyrl.tex \
tex-loadhyph-sr-latn.tex \
texlive-hyphen-serbian"

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
