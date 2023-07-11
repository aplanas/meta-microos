SUMMARY = "Church Slavonic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Church Slavonic in UTF-8 encoding"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-churchslavonic-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "1b43eccb12b1c25565adee83cccdf8c408b2cb79b4a92015dd3394a3a5a9a7fca59e21a0026b834a518c52d8ac32196dc114ee33bb9b0c73e4e087a7626531c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-cu.tex \
tex-loadhyph-cu.tex \
texlive-hyphen-churchslavonic"

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
