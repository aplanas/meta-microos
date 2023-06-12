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

RPM_NAME = "texlive-pst-sigsys-2023.201.1.4svn21667-53.1.noarch.rpm"
RPM_HASH = "9741557ec8ff76e135c6e5b767d841393346db27eaff03b7c1adf534ec85e60168f6537d983068dcb897b804b865f19af8ea81d141d48f8274a681992b9014d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-sigsys.sty) \
tex(pst-sigsys.tex) \
texlive-pst-sigsys"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
