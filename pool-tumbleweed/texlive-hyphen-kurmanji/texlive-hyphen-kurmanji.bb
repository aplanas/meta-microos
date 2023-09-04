SUMMARY = "Kurmanji hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Kurmanji (Northern Kurdish) as spoken \
in Turkey and by the Kurdish diaspora in Europe, in T1/EC and \
UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-kurmanji-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "a4e9422f82fd4482c12eade7a446af7d0166bcbf190e7313b2a94a3ab3cef0a09645a7aab9d57a277f629a189a5bc8c674c14f30a6ecfeab957714bab6d6499c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-kmr.ec.tex \
tex-hyph-kmr.tex \
tex-loadhyph-kmr.tex \
texlive-hyphen-kurmanji"

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
