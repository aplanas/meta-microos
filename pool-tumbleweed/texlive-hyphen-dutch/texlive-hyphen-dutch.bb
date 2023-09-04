SUMMARY = "Dutch hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Dutch in T1/EC and UTF-8 encodings. \
These patterns don't handle cases like 'menuutje' > 'menu-tje', \
and don't hyphenate words that have different hyphenations \
according to their meaning."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn58609"

RPM_NAME = "texlive-hyphen-dutch-2023.209.1.1svn58609-54.1.noarch.rpm"
RPM_HASH = "52f1845732a1696b6727ba70dab8de1e044904d961cda6826c1888bd5a2434b89962648fddea30ddd229e207fa1f1827626b0833217e437fdce0d5922c89ee16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-nl.ec.tex \
tex-hyph-nl.tex \
tex-loadhyph-nl.tex \
texlive-hyphen-dutch"

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
