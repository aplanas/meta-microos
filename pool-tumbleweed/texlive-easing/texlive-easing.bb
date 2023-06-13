SUMMARY = "Easing functions for pgfmath"
DESCRIPTION = "This library implements a collection of easing functions and \
adds them to the PGF mathematical engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn59975"

RPM_NAME = "texlive-easing-2023.201.0.0.1svn59975-53.1.noarch.rpm"
RPM_HASH = "76989c2afad7b534c9f984dcef3a3e3024d8741ad8f692592d0b28d08a2ff93e180ab7c477bd32fe74f78b2b6fb0625abf0aada36bc0223ac68ed9ec890ebb7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgflibraryeasing.code.tex) \
texlive-easing"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
