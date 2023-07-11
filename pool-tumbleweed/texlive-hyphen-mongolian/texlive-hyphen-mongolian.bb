SUMMARY = "Mongolian hyphenation patterns in Cyrillic script"
DESCRIPTION = "Hyphenation patterns for Mongolian in T2A, LMC and UTF-8 \
encodings. LMC encoding is used in MonTeX. The package includes \
two sets of patterns that will hopefully be merged in future."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-mongolian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "dd1a6039bfd6398ad47be7ebb10296b4b211e2e6f7defbf42c6733122c4425b1cba04a30ad4f08796fdfe7bda9c287192f5fc9e226626f9bbca7b746d6b7316e"
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
