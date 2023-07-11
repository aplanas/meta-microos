SUMMARY = "Diagrams of board positions in the games of Havannah and Hex"
DESCRIPTION = "This package defines macros for typesetting diagrams of board \
positions in the games of Havannah and Hex."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn36348"

RPM_NAME = "texlive-havannah-2023.201.svn36348-53.2.noarch.rpm"
RPM_HASH = "6ebb7805453b92b3de186b7b879de6694e5a6a238c4fd1b1d5ce32beabb66f51c03c7d71c2d0e3d36f9625c829b244d49f1c88eb7786b4d2d17eca4179d7043d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-havannah.sty \
texlive-havannah"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
