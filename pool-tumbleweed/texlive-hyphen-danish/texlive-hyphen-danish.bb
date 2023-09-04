SUMMARY = "Danish hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Danish in T1/EC and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-danish-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "05dcafa77ec10ea85168d7dc2cc62a60d52c6af1a1d43cc689a42c5ac7bc4832b81058b33f5364774226390bef2feb99f62c388b44b77636f7b5262a5d35f270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-da.ec.tex \
tex-hyph-da.tex \
tex-loadhyph-da.tex \
texlive-hyphen-danish"

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
