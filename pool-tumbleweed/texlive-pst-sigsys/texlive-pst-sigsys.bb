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

RPM_NAME = "texlive-pst-sigsys-2023.209.1.4svn21667-54.2.noarch.rpm"
RPM_HASH = "ba6e9e51476fda456ab6a5c52f0fdc2f6d7afc57d691a31271e001e95e23096306c8e6c039bb5683010f2867fc4b0ecd0c3e3e789821dfde8fb85c68a117e3d7"
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
