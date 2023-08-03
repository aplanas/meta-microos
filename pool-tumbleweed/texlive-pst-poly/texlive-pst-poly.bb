SUMMARY = "Polygons with PSTricks"
DESCRIPTION = "This PSTricks package provides a really rather simple command \
\\PstPolygon that will draw various regular and non-regular \
polygons (according to command parameters); various shortcuts \
to commonly-used polygons are provided, as well as a command \
\\pspolygonbox that frames text with a polygon. The package uses \
the xkeyval package for argument decoding."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.63svn35062"

RPM_NAME = "texlive-pst-poly-2023.209.1.63svn35062-54.1.noarch.rpm"
RPM_HASH = "0bd6127026875a41b42823ceb8fc3bee98bc7b5b5cf86e524bed5ee259f0bc6d893f7d053d4bf7f0cb62f870d2bb2ba27fbc23019e538c18110f7356aa0cdf55"
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
