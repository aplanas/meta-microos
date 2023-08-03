SUMMARY = "Fix alignment at \\overset or \\underset"
DESCRIPTION = "This package allows the base character of \\underset or \\overset \
to be used as the alignment position for the amsmath aligned \
math environments."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn47290"

RPM_NAME = "texlive-aligned-overset-2023.209.0.0.1.0svn47290-55.1.noarch.rpm"
RPM_HASH = "ad2bf62b33f87ba627255b2dc20c7b18abb6cf1c03d2089147ee8cec13ba60a2eaa1f31a9e574a18673e7c3d67840149666d51c8d3b02de77c9b7931ddf91145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aligned-overset.sty \
texlive-aligned-overset"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-mathtools.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
