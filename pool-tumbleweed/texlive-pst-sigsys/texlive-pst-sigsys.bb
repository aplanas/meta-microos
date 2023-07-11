SUMMARY = "Support of signal processing-related disciplines"
DESCRIPTION = "The package offers a collection of useful macros for \
disciplines related to signal processing. It defines macros for \
plotting a sequence of numbers, drawing the pole-zero diagram \
of a system, shading the region of convergence, creating an \
adder or a multiplier node, placing a framed node at a given \
coordinate, creating an up-sampler or a down-sampler node, \
drawing the block diagram of a system, drawing adaptive \
systems, sequentially connecting a list of nodes, and \
connecting a list of nodes using any node-connecting macro."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn21667"

RPM_NAME = "texlive-pst-sigsys-2023.201.1.4svn21667-53.2.noarch.rpm"
RPM_HASH = "3f4114fa70a65d3542bef52a7b08968005c5476174fa005a54555f181f5736865fce32b6ba524eed79ccd58882b99beff2ce58344e68ea25b23b3a7f0baafd9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-sigsys.sty \
tex-pst-sigsys.tex \
texlive-pst-sigsys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
