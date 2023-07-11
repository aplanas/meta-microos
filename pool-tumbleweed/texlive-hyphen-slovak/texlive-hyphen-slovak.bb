SUMMARY = "Slovak hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Slovak in T1/EC and UTF-8 encodings. \
Original patterns 'skhyphen' are still distributed in the \
'csplain' package and loaded with ISO Latin 2 encoding (IL2)."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-slovak-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "f44c356b8ca3d1eac9a31615172be973d74538f18ddea28077f21bce0e881f3b280059f3b2f64d6dc02d8bf421d96f332b129a3002cb736e19a72e5654f2190f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-sk.ec.tex \
tex-hyph-sk.tex \
tex-loadhyph-sk.tex \
texlive-hyphen-slovak"

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
