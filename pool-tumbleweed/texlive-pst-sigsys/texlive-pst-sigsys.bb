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

PV = "2023.209.1.4svn21667"

RPM_NAME = "texlive-pst-sigsys-2023.209.1.4svn21667-54.1.noarch.rpm"
RPM_HASH = "8b39896240732279b5904566a9806f435e67469a49587ccc075596c1b721f7768ef1095b822dc07661b7dc85c6108fde0d4f7e0dfc3920563f0fa049a2176b93"
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
