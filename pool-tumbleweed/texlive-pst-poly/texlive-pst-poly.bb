SUMMARY = "Polygons with PSTricks"
DESCRIPTION = "This PSTricks package provides a really rather simple command \
\\PstPolygon that will draw various regular and non-regular \
polygons (according to command parameters); various shortcuts \
to commonly-used polygons are provided, as well as a command \
\\pspolygonbox that frames text with a polygon. The package uses \
the xkeyval package for argument decoding."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.63svn35062"

RPM_NAME = "texlive-pst-poly-2023.201.1.63svn35062-53.1.noarch.rpm"
RPM_HASH = "e896de9067e7203973b0ebee0eb15101c2ef8e79cf2c53b0cfa3be1bbad92ea43f27f6dfa38cf4709884b84e5c6961184c3731307fa111f4951194d64eb100ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-poly.sty \
tex-pst-poly.tex \
texlive-pst-poly"

RDEPENDS:${PN} += "/bin/sh \
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
