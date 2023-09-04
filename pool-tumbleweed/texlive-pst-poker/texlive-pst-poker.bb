SUMMARY = "Drawing poker cards"
DESCRIPTION = "This PSTricks related package can create poker cards in various \
manners."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.0.0.03bsvn65818"

RPM_NAME = "texlive-pst-poker-2023.209.0.0.03bsvn65818-54.2.noarch.rpm"
RPM_HASH = "69a2509f0f1485cb4dbc0b62cb010e40a19644b07997affcf128440386f63514e2bd8700b5f4a887a6d1239e525fc0405f3d1198c2a0fff7a95cca82c4a2daa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-poker.sty \
texlive-pst-poker"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-multido.sty \
tex-pst-blur.sty \
tex-pst-fill.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
