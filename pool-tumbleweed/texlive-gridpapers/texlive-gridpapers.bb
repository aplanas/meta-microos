SUMMARY = "Graph paper backgrounds and color schemes"
DESCRIPTION = "This package provides many preset yet customizable graph paper \
backgrounds. Some of the preset patterns include standard \
quadrille or graph pattern, dot grid, hexagons, isometric or \
triangular grid, squares with 45deg 'light cone' lines, ruled, \
and more. Pattern sizes can be controlled via package options. \
There are several preset color palletes, and colors can be \
overridden. The package uses the PGF/TikZ package, and the \
geometry package to control page size."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn58723"

RPM_NAME = "texlive-gridpapers-2023.201.1.0.2svn58723-53.2.noarch.rpm"
RPM_HASH = "e34b283f14d67454cf5ccb90cb5c0a8903c3accaeb591cf42ea08b52b0a67b7b90c2a24fbb3581e84c58f08a8b2ebb623698ff8702e688486d462d4841442c50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridpapers.sty \
texlive-gridpapers"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage-1x.sty \
tex-everypage.sty \
tex-geometry.sty \
tex-kvoptions.sty \
tex-pagecolor.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
