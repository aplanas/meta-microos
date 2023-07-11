SUMMARY = "Czech hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Czech in T1/EC and UTF-8 encodings. \
Original patterns 'czhyphen' are still distributed in the \
'csplain' package and loaded with ISO Latin 2 encoding (IL2)."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-czech-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "3ef135d03d2e4a8ed80f5cbe18c7bb1b41e59f50e0556d79ac3f174ed1bbc7e0b1b8ed91388f573a03f4975e2938be06a28d94d5997cce6a3b3e8e3834368e5c"
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
