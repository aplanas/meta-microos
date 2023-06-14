SUMMARY = "Simple syntax for trees"
DESCRIPTION = "The package provides a qtree-like front end for PSTricks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pst-qtree-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "e0e8903ca20bee570a4bffa7842cd9a2f3b2b553ea7359518135e1ff1c2c529623eca0e4a457c9302b4b37420d17129f341b1fdf7d98b3615b62854a156a9243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-qtree.sty \
tex-pst-qtree.tex \
texlive-pst-qtree"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pst-tree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
