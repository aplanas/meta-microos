SUMMARY = "Define SVG named colours"
DESCRIPTION = "The package defines the W3C Scalable Vector Graphics (SVG) \
colour names for use with both the color and PSTricks packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-svgcolor-2023.209.1.0svn15878-58.1.noarch.rpm"
RPM_HASH = "aaa314a60f6afc1ae5a731643892524d3e8658ffe9d585851d27560b654e1ce50d36ec72d495e9fd288018cfa838eaf3e6f4731e233696926fd009ef3e41af55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svgcolor.sty \
texlive-svgcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
