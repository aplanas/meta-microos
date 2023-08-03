SUMMARY = "Easily typeset Control Block Diagrams and Signal Flow Graphs"
DESCRIPTION = "Kblocks defines a number of commands to make drawing control \
block diagrams using TikZ/PGF more structured and easier. It \
reduces the learning curve forTikZ/PGF and serves as a \
frontend, by focusing on the block resp. flow diagrams only."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn57617"

RPM_NAME = "texlive-kblocks-2023.209.2.0svn57617-56.1.noarch.rpm"
RPM_HASH = "41fe6e1edfdfa500caba32b46b36ada5618a7961595f8c5449fb0664426eda6cc02c633eafb9a868bce051056b4988b4f74894e5b3737c9dbf182fe10ff99d55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kblocks.sty \
texlive-kblocks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-circuitikz.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
