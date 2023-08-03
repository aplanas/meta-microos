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

RPM_NAME = "texlive-pst-solarsystem-2023.209.0.0.13svn45097-54.1.noarch.rpm"
RPM_HASH = "987f986ee240b1caebc96db1d08ccc423038ed1d37d67abdc280e649c7466247d59b480d9a05cb7a413c76d515c841244d9a3a921d614afeb82281228a523906"
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
