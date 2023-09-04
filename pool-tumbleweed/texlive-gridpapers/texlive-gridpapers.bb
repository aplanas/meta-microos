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

RPM_NAME = "texlive-gridpapers-2023.209.1.0.2svn58723-54.2.noarch.rpm"
RPM_HASH = "ba6b2137b6c6515740132ee8e45e3b522d3b21d9ed9008f31aed548e97c5fc789223a274d70c9d7ad35018b4570ac321bf4a22f9abb348948418b3f2e4020a99"
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
