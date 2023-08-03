SUMMARY = "Extensions to epic and the LaTeX drawing tools"
DESCRIPTION = "Extensions to epic and the LaTeX picture drawing environment, \
include the drawing of lines at any slope, the drawing of \
circles in any radii, and the drawing of dotted and dashed \
lines much faster with much less TeX memory, and providing \
several new commands for drawing ellipses, arcs, splines, and \
filled circles and ellipses. The package uses tpic \\special \
commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1esvn15878"

RPM_NAME = "texlive-eepic-2023.209.1.1esvn15878-54.1.noarch.rpm"
RPM_HASH = "58ba096539574bbe0e292e96ca10e4107abf1e642b34ddf65a8f4bb9b99db0fdd34e56e08ffe7b1799ba2afbe51a2a910af2b00b3dc3c8e80bd434b9559cecc0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eepic.sty \
tex-eepicemu.sty \
tex-epic.sty \
texlive-eepic"

RDEPENDS:${PN} += "/usr/bin/sh \
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
