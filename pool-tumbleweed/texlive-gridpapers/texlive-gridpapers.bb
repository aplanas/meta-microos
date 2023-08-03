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

PV = "2023.209.1.0.2svn58723"

RPM_NAME = "texlive-gridpapers-2023.209.1.0.2svn58723-54.1.noarch.rpm"
RPM_HASH = "49bdb0740de32ec611740c4ff9d746e66c09ef0cd1abf9108e5b11973d9bbb9a5666acc6f434f6fd5fad03fe1571ef53591bcf4a2c39250967c5befa3784c4d7"
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
