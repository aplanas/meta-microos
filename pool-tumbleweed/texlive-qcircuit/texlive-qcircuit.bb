SUMMARY = "Macros to generate quantum ciruits"
DESCRIPTION = "The package supports those within the quantum information \
community who typeset quantum circuits, using xy-pic package, \
offering macros designed to help users generate circuits."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-2023.201.2.6.0svn48400-53.2.noarch.rpm"
RPM_HASH = "f063d2ce75e2e690f387b9a00d6679012b4473e9944e42cd8ed351708e615d89aef005cacf2d49e3da6d06c48edfafba9ea2496dd4ba6996dc166d7380dcbf08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qcircuit.sty \
texlive-qcircuit"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
