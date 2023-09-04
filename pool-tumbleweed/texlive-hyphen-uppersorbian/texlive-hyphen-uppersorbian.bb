SUMMARY = "Upper Sorbian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Upper Sorbian in T1/EC and UTF-8 \
encodings."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-uppersorbian-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "7347f5e822d5880bb6361ea13abf0352d80549e158fdb2c82774cc6e3714bc7ec5ab5a05618b2cb503fc2c5b2d290335e9819dad6e9c2481e9775ccffb168fe7"
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
