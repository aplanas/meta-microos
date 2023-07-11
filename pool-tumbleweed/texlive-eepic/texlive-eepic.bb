SUMMARY = "Extensions to epic and the LaTeX drawing tools"
DESCRIPTION = "Extensions to epic and the LaTeX picture drawing environment, \
include the drawing of lines at any slope, the drawing of \
circles in any radii, and the drawing of dotted and dashed \
lines much faster with much less TeX memory, and providing \
several new commands for drawing ellipses, arcs, splines, and \
filled circles and ellipses. The package uses tpic \\special \
commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.1esvn15878"

RPM_NAME = "texlive-eepic-2023.201.1.1esvn15878-53.2.noarch.rpm"
RPM_HASH = "afe7a20cbb902b549824f161437c116d8f72482eaa148ce48fd6e0066b47e0e4f46b3e90d87c26205b6effdeda7955a2f796e3612226e61857a6f149c9c1e040"
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
