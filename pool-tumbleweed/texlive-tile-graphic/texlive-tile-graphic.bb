SUMMARY = "Create tiles of a graphical file"
DESCRIPTION = "This package breaks a given graphical file into n rows and m \
columns of subgraphics, which are called tiles. The tiles can \
be written separately to individual PDF files, or packaged into \
a single PDF file."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55325"

RPM_NAME = "texlive-tile-graphic-2023.209.svn55325-53.1.noarch.rpm"
RPM_HASH = "e4a675e404121e1544cdb364a8ed110c2777f0620800f5c9a4b7628a81f8018edeb563576c204b51bcbaddbe56cb98ee582e1a6ee960ae6b0c9280cc9c88e818"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tile-graphic.sty \
texlive-tile-graphic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-multido.sty \
tex-shellesc.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
