SUMMARY = "Plot the solar system for a specific date"
DESCRIPTION = "The package uses pstricks to produce diagrams of the visible \
planets, projected on the plane of the ecliptic. It is not \
possible to represent all the planets in their real \
proportions, so only Mercury, Venus, Earth and Mars have their \
orbits in correct proportions and their relative sizes are \
observed. Saturn and Jupiter are in the right direction, but \
not in the correct size."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.13svn45097"

RPM_NAME = "texlive-pst-solarsystem-2023.209.0.0.13svn45097-54.2.noarch.rpm"
RPM_HASH = "fdbbb0375f6965bf7dcd3f0a66d89ee02948c1e23a2611818077d77ed3438e66ffaf7aa7fc75c3b28ca871d49c3b2026537246503dc930ee5c4a7867af9b3f08"
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
