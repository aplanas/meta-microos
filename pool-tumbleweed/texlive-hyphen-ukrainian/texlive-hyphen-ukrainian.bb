SUMMARY = "Ukrainian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Ukrainian in T2A and UTF-8 encodings. \
For 8-bit engines, the 'ukrhyph' package provides a number of \
different pattern sets, as well as different (8-bit) encodings, \
that can be chosen at format-generation time. The UTF-8 version \
only provides the default pattern set. A mechanism similar to \
the one used for 8-bit patterns may be implemented in the \
future."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-ukrainian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "93f8cfa5ebe040d9aa2a369dee042f7063f4c38e083eca85746e5715923f4ac48db985af1c76ab44620c7d107c8475cc5c4ba969956318242bab8815f5af7683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-quote-uk.tex \
tex-hyph-uk.t2a.tex \
tex-hyph-uk.tex \
tex-loadhyph-uk.tex \
texlive-hyphen-ukrainian"

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
texlive-scripts-bin \
texlive-ukrhyph"

inherit rpm
