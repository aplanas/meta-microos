SUMMARY = "Mongolian hyphenation patterns in Cyrillic script"
DESCRIPTION = "Hyphenation patterns for Mongolian in T2A, LMC and UTF-8 \
encodings. LMC encoding is used in MonTeX. The package includes \
two sets of patterns that will hopefully be merged in future."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-mongolian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "1580d4be3c63c34d6a005d368b0becab168f12361c4018c19bb7f43a71363475619e0ec5cd7e02db446169a5a7de63a1cc76dac7df8aee351dc084b9bf1427f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-mn-cyrl-x-lmc.lmc.tex \
tex-hyph-mn-cyrl-x-lmc.tex \
tex-hyph-mn-cyrl.t2a.tex \
tex-hyph-mn-cyrl.tex \
tex-loadhyph-mn-cyrl-x-lmc.tex \
tex-loadhyph-mn-cyrl.tex \
texlive-hyphen-mongolian"

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
