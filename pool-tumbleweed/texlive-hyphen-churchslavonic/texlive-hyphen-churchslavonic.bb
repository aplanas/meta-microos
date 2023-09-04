SUMMARY = "Church Slavonic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Church Slavonic in UTF-8 encoding"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-churchslavonic-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "f86b8c29c7f44fea7742a82d7d305fd30f58165089528c18f060f7efd660a97bcceb5f27de9a35c202c071dada7e1ef583337339e116946476670d48a7336ec9"
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
