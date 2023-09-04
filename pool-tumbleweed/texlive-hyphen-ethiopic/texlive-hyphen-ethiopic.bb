SUMMARY = "Hyphenation patterns for Ethiopic scripts"
DESCRIPTION = "Hyphenation patterns for languages written using the Ethiopic \
script for Unicode engines. They are not supposed to be \
linguistically relevant in all cases and should, for proper \
typography, be replaced by files tailored to individual \
languages."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-ethiopic-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "b747491a2544ee1f1dc5ced39c22f183b8b6e62df9cb69ffed2897306b121e70fd16322bd7d1ebb383fd6001b5bc053474e68df167c626aee0339747d348700b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-mul-ethi.tex \
tex-loadhyph-mul-ethi.tex \
texlive-hyphen-ethiopic"

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
