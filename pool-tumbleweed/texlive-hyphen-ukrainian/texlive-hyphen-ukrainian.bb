SUMMARY = "Ukrainian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Ukrainian in T2A and UTF-8 encodings. \
For 8-bit engines, the 'ukrhyph' package provides a number of \
different pattern sets, as well as different (8-bit) encodings, \
that can be chosen at format-generation time. The UTF-8 version \
only provides the default pattern set. A mechanism similar to \
the one used for 8-bit patterns may be implemented in the \
future."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58652"

RPM_NAME = "texlive-hyphen-ukrainian-2023.201.svn58652-52.1.noarch.rpm"
RPM_HASH = "0595cbb89e855a6c94ceb280c474e3943c4d4bc5b248d0d0636d17543010542205539cf4f7041feead44f8aa580a5122fdea1a86be4f252a925b25beebb07bcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-quote-uk.tex \
tex-hyph-uk.t2a.tex \
tex-hyph-uk.tex \
tex-loadhyph-uk.tex \
texlive-hyphen-ukrainian"

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
texlive-scripts-bin \
texlive-ukrhyph"

inherit rpm
