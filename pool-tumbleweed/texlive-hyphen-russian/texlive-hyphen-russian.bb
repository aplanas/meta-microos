SUMMARY = "Russian hyphenation patterns"
DESCRIPTION = "Hyphenation patterns for Russian in T2A and UTF-8 encodings. \
For 8-bit engines, the 'ruhyphen' package provides a number of \
different pattern sets, as well as different (8-bit) encodings, \
that can be chosen at format-generation time. The UTF-8 version \
only provides the default pattern set. A mechanism similar to \
the one used for 8-bit patterns may be implemented in the \
future."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn58609"

RPM_NAME = "texlive-hyphen-russian-2023.201.svn58609-52.1.noarch.rpm"
RPM_HASH = "375c0e133601adda1680ecab7d50d5ac470ba009b0136e5f913757e6a236320f505b07f3bb6dd7eeb994f2cfbe56da4f9758e37116c0bad992c416e7adbf6a7e"
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
