SUMMARY = "Bulgarian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Bulgarian in T2A and UTF-8 encodings."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58685"

RPM_NAME = "texlive-hyphen-bulgarian-2023.201.svn58685-52.1.noarch.rpm"
RPM_HASH = "7d770b74cfe8531ed9a93ed7a9509ed31c7ff9d61b0b30730177f29a3db8bb9a3af8c1a6f2bb1367309bd9579d8353b2d2058fb5f4a2ad4aed4633c6c3714245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-bg.t2a.tex \
tex-hyph-bg.tex \
tex-loadhyph-bg.tex \
texlive-hyphen-bulgarian"

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
