SUMMARY = "Czech hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Czech in T1/EC and UTF-8 encodings. \
Original patterns 'czhyphen' are still distributed in the \
'csplain' package and loaded with ISO Latin 2 encoding (IL2)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-czech-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "f2c356e913e268c2a30252f2eef89d3126311c8aab0d19d587118c64bfecf3eae08e5c4931906b5f27cfadc20fda03ad74758c5e9771d2532880071fd9b830b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-cs.ec.tex \
tex-hyph-cs.tex \
tex-loadhyph-cs.tex \
texlive-hyphen-czech"

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
