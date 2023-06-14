SUMMARY = "Dutch hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Dutch in T1/EC and UTF-8 encodings. \
These patterns don't handle cases like 'menuutje' > 'menu-tje', \
and don't hyphenate words that have different hyphenations \
according to their meaning."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn58609"

RPM_NAME = "texlive-hyphen-dutch-2023.201.1.1svn58609-52.1.noarch.rpm"
RPM_HASH = "ee49383012ac88bc7b2889d63973bbea70170059454b1898e17e05fb15c26ab96d6642af6bc8608c0f507226f5e74974cb9c1772c319a6ffca70a4bd69e63ff8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-nl.ec.tex \
tex-hyph-nl.tex \
tex-loadhyph-nl.tex \
texlive-hyphen-dutch"

RDEPENDS:${PN} += "/bin/sh \
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
