SUMMARY = "Russian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Russian in T2A and UTF-8 encodings. \
For 8-bit engines, the 'ruhyphen' package provides a number of \
different pattern sets, as well as different (8-bit) encodings, \
that can be chosen at format-generation time. The UTF-8 version \
only provides the default pattern set. A mechanism similar to \
the one used for 8-bit patterns may be implemented in the \
future."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn58609"

RPM_NAME = "texlive-hyphen-russian-2023.209.svn58609-54.1.noarch.rpm"
RPM_HASH = "fcd2b3b5fabc022d0f89516737fd46f496e501eea8007fbe108ccf502d6b5a296000ff57b1604c9dc386c1b433c82b08f607b3db549159a45cd8f81b064b6eac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyph-ru.t2a.tex \
tex-hyph-ru.tex \
tex-loadhyph-ru.tex \
texlive-hyphen-russian"

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
texlive-ruhyphen \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
