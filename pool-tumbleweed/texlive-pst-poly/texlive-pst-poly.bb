SUMMARY = "Polygons with PSTricks"
DESCRIPTION = "This PSTricks package provides a really rather simple command \
\\PstPolygon that will draw various regular and non-regular \
polygons (according to command parameters); various shortcuts \
to commonly-used polygons are provided, as well as a command \
\\pspolygonbox that frames text with a polygon. The package uses \
the xkeyval package for argument decoding."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.63svn35062"

RPM_NAME = "texlive-pst-poly-2023.209.1.63svn35062-54.2.noarch.rpm"
RPM_HASH = "7489416a1e8283928c329257bb238e1b4c0b29005857388053003fb0a7385d9c134014ad75d2b6141d1ec58b8c9fa5f2783f24afbda993f8af3ff21722501636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-poly.sty \
tex-pst-poly.tex \
texlive-pst-poly"

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
