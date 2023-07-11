SUMMARY = "Polygons with PSTricks"
DESCRIPTION = "This PSTricks package provides a really rather simple command \
\\PstPolygon that will draw various regular and non-regular \
polygons (according to command parameters); various shortcuts \
to commonly-used polygons are provided, as well as a command \
\\pspolygonbox that frames text with a polygon. The package uses \
the xkeyval package for argument decoding."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.63svn35062"

RPM_NAME = "texlive-pst-poly-2023.201.1.63svn35062-53.2.noarch.rpm"
RPM_HASH = "8a61fdb602c160c660f349495dd04bec279d3c89461e6fda1e5476c436301f0f5ed7d74d789b6e888fd111c290d17dba78136ab8166d5059672f8e4f9ef23b37"
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
