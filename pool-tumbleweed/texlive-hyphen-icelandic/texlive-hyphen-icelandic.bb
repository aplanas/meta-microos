SUMMARY = "Icelandic hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Icelandic in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58652"

RPM_NAME = "texlive-hyphen-icelandic-2023.208.svn58652-53.1.noarch.rpm"
RPM_HASH = "b344a5839b2d42a8d541f8cbbe2cc795dc9e5e249c99e20ca682df3d3c610883eb4bae875b9622ea2810ac06fbfda72a42eb9520b5ae3c11d4e196640d1efbf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-is.ec.tex \
tex-hyph-is.tex \
tex-loadhyph-is.tex \
texlive-hyphen-icelandic"

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
