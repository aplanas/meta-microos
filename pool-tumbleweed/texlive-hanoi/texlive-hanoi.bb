SUMMARY = "Tower of Hanoi in TeX"
DESCRIPTION = "The Plain TeX program (typed in the shape of the towers of \
Hanoi) serves both as a game and as a TeX programming exercise. \
As a game it will solve the towers with (up to) 15 discs (with \
15 discs, 32767 moves are needed)."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.20120101svn25019"

RPM_NAME = "texlive-hanoi-2023.201.20120101svn25019-53.2.noarch.rpm"
RPM_HASH = "7f27b932d6457791ba6dd44bdeb3787c97dfd157763c1877a56b966e7bb6028b83e60c02f776a06347d10db6d1561c0e1faa81b842b0ec7b48d07af972356636"
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
