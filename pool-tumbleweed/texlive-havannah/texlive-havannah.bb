SUMMARY = "Diagrams of board positions in the games of Havannah and Hex"
DESCRIPTION = "This package defines macros for typesetting diagrams of board \
positions in the games of Havannah and Hex."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn36348"

RPM_NAME = "texlive-havannah-2023.201.svn36348-53.1.noarch.rpm"
RPM_HASH = "46aabb2cfbb6e867378b452c423094ffd5eeab9653048e9d45cec2cefac74226a404f1dc9cca9b0f539d84edee159363320708f5ceceefb1589893a129abc457"
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
