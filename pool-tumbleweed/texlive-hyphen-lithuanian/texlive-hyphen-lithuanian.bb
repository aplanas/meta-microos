SUMMARY = "Lithuanian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Lithuanian in L7X and UTF-8 encodings. \
\\lefthyphenmin and \\righthyphenmin have to be at least 2."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58652"

RPM_NAME = "texlive-hyphen-lithuanian-2023.209.svn58652-54.1.noarch.rpm"
RPM_HASH = "ba1f1a7d3e4fbbbd1dd8bd9e1ccea28631142837cbfeb4c6c66d4fcffe55784a530a17606ef1ea2710a6891161e9bb230a5a73ec1239b1015fafcaec78ded422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-lt.l7x.tex \
tex-hyph-lt.tex \
tex-loadhyph-lt.tex \
texlive-hyphen-lithuanian"

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
