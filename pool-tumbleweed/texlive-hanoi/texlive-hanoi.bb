SUMMARY = "Tower of Hanoi in TeX"
DESCRIPTION = "The Plain TeX program (typed in the shape of the towers of \
Hanoi) serves both as a game and as a TeX programming exercise. \
As a game it will solve the towers with (up to) 15 discs (with \
15 discs, 32767 moves are needed)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.20120101svn25019"

RPM_NAME = "texlive-hanoi-2023.209.20120101svn25019-54.2.noarch.rpm"
RPM_HASH = "e83a4535366cffca6d2e0d9f13fd8f4d5083f4e0474a43d6487e1be1b1176a9fac0a9c5d6002143d599d24872090bb2d51f645bf3c8eb19aeb31beff7d942fbc"
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
