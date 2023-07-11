SUMMARY = "Dutch hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Dutch in T1/EC and UTF-8 encodings. \
These patterns don't handle cases like 'menuutje' > 'menu-tje', \
and don't hyphenate words that have different hyphenations \
according to their meaning."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn58609"

RPM_NAME = "texlive-hyphen-dutch-2023.208.1.1svn58609-53.1.noarch.rpm"
RPM_HASH = "5911abe15764bd0b42f5e2b2c5f2fdb33a98753a43b0f4f3cd7b2ca15a520eb17f2e0f2430fc8081fc3bcbd59e4f27d345bbd3ed0be41970083b86ba4f5512aa"
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
