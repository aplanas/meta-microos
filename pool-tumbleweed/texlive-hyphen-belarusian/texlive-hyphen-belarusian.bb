SUMMARY = "Belarusian hyphenation patterns"
DESCRIPTION = "Belarusian hyphenation patterns in T2A and UTF-8 encodings"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-belarusian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "70ac4d11778cf627633f6dd0642dc8badc16181db1838f68e93ed85e2844d0ee09915e8303d4d51cdfceb6c37436114c19f9f502bdf752833d52af59757fa2c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-be.t2a.tex \
tex-hyph-be.tex \
tex-hyph-quote-be.tex \
tex-loadhyph-be.tex \
texlive-hyphen-belarusian"

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
