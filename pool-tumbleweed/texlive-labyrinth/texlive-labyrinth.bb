SUMMARY = "Draw labyrinths and solution paths"
DESCRIPTION = "The labyrinth package provides code and an environment for \
typesetting simple labyrinths with LaTeX, and generating an \
automatic or manual solution path."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn33454"

RPM_NAME = "texlive-labyrinth-2023.209.1.0svn33454-56.1.noarch.rpm"
RPM_HASH = "f1f1b400e83bcd894ffb700876d3ecfec4252536368aa50d914c26e81fbb742e191f023422c2ef5e49c4a8a36be3324feff744cd6f39c261c604887d00582675"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-labyrinth.sty \
texlive-labyrinth"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-picture.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
