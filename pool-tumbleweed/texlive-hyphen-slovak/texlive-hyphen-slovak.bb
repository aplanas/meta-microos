SUMMARY = "Slovak hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Slovak in T1/EC and UTF-8 encodings. \
Original patterns 'skhyphen' are still distributed in the \
'csplain' package and loaded with ISO Latin 2 encoding (IL2)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-slovak-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "a8af85e23bae99154f16c0d4eed8c59418798287914352b089cc21d633c8150ad1731dd7ce283c3d33dc88f93c78e77cf5ace785184ac1cfdb59b1531b33f284"
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
