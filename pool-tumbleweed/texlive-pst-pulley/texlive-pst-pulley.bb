SUMMARY = "Plot pulleys, using PSTricks"
DESCRIPTION = "The package enables the user to draw pulley systems with up to \
6 pulleys. The pulley diagrams are labelled with the physical \
properties of the system. The package uses pstricks and \
requires several PSTricks-related packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn62977"

RPM_NAME = "texlive-pst-pulley-2023.201.0.0.02svn62977-53.2.noarch.rpm"
RPM_HASH = "84ad4229236e992e1c7b60554aa4bffd8cc5ee246c027e1983bc46a0a8fa63fcd88c8516cc4aab024db2ff1cc8904986e2bec0654c250822c445797c578436fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pulley.sty \
tex-pst-pulley.tex \
texlive-pst-pulley"

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
