SUMMARY = "Create tiles of a graphical file"
DESCRIPTION = "This package breaks a given graphical file into n rows and m \
columns of subgraphics, which are called tiles. The tiles can \
be written separately to individual PDF files, or packaged into \
a single PDF file."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55325"

RPM_NAME = "texlive-tile-graphic-2023.201.svn55325-52.1.noarch.rpm"
RPM_HASH = "7213d7f9d9026785d67007de933e3ac35c4d0f382bf1d5376ddc87516249ba06b2205fda1dba754197eeb68f433bb703e4c655f05944a3b1585e064abb751419"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tile-graphic.sty \
texlive-tile-graphic"

RDEPENDS:${PN} += "/bin/sh \
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
