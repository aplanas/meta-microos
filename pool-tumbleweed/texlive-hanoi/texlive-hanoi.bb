SUMMARY = "Tower of Hanoi in TeX"
DESCRIPTION = "The Plain TeX program (typed in the shape of the towers of \
Hanoi) serves both as a game and as a TeX programming exercise. \
As a game it will solve the towers with (up to) 15 discs (with \
15 discs, 32767 moves are needed)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.20120101svn25019"

RPM_NAME = "texlive-hanoi-2023.209.20120101svn25019-54.1.noarch.rpm"
RPM_HASH = "98519c84362e85e904f90dd695d9f1ae3bf2d14aa13c70a26aa5dfb1e0eb3d979d0acce2ecf709da34a5464cca296eb6ce62a6db093b3a2f74d26c6a0f00c4ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hanoi.tex \
texlive-hanoi"

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
