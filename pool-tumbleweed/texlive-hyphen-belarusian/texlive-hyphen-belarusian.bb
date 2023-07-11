SUMMARY = "Belarusian hyphenation patterns"
DESCRIPTION = "Belarusian hyphenation patterns in T2A and UTF-8 encodings"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-belarusian-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "dc373c9fda1d56824d2627ef5e3910f8b8d68841451bb6cc53e3e7c529c248501cd8a4befeef752bec62b09cd726a41684f4081e390085c63b4b38eaf222f47a"
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
