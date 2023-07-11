SUMMARY = "Upper Sorbian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Upper Sorbian in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn58609"

RPM_NAME = "texlive-hyphen-uppersorbian-2023.208.svn58609-53.1.noarch.rpm"
RPM_HASH = "504154574be481348cf4d251fdcafe46f466b4e03918766c6b75cd42099d113d8560f099b8b72aaa8da0d89b3176d04ca5cf24e658dc6e520676be3e702be0cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-hsb.ec.tex \
tex-hyph-hsb.tex \
tex-loadhyph-hsb.tex \
texlive-hyphen-uppersorbian"

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
