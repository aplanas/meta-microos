SUMMARY = "German input encodings in LaTeX"
DESCRIPTION = "An early package for using alternate input encodings. The \
author considers the package mostly obsolete, since most of its \
functions are taken by the inputenc package; however, inputenc \
doesn't support the roman8 and atari encodings, so umlaute \
remains the sole source of that support."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn15878"

RPM_NAME = "texlive-umlaute-2023.209.2.1svn15878-54.1.noarch.rpm"
RPM_HASH = "1597d607c442cea8d21b6b45cce4d477a515cdd45acd1daad489f0dcf2281f16b2f030f7b08a35c942185b0b98c8298f76962206b01720badc4b9ff33c8b1db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-atari.def \
tex-isolatin.def \
tex-mac.def \
tex-pc850.def \
tex-roman8.def \
tex-umlaute.sty \
texlive-umlaute"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-applemac.def \
tex-cp850.def \
tex-inputenc.sty \
tex-latin1.def \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
