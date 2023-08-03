SUMMARY = "Create EPS files from PSTricks figures"
DESCRIPTION = "Pst-eps is a PSTricks-based package for exporting PSTricks \
images 'on the fly' to encapsulated PostScript (EPS) image \
files, which can then be read into a document in the usual way."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-pst-eps-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "3d0366a07abe1a41330b6f851662081c6b88e4977566e9b311b50b805c279ca7101bed466dc45c148cd90ece4eb450b195e67b7f62cf9ff275a573e03fb353a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-eps.sty \
tex-pst-eps.tex \
texlive-pst-eps"

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
