SUMMARY = "Plot the solar system for a specific date"
DESCRIPTION = "The package uses pstricks to produce diagrams of the visible \
planets, projected on the plane of the ecliptic. It is not \
possible to represent all the planets in their real \
proportions, so only Mercury, Venus, Earth and Mars have their \
orbits in correct proportions and their relative sizes are \
observed. Saturn and Jupiter are in the right direction, but \
not in the correct size."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn45097"

RPM_NAME = "texlive-pst-solarsystem-2023.201.0.0.13svn45097-53.2.noarch.rpm"
RPM_HASH = "3be0640b1594f8a50b3c064f651b34153c2f18ceb47d3b497ea83c0b534d03896aac1292e2132d09d88007e8c350a0b0003c5996068bf26337b54fae137d6cb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-solarsystem.sty \
tex-pst-solarsystem.tex \
texlive-pst-solarsystem"

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
