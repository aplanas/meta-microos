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

RPM_NAME = "texlive-gridpapers-2023.201.1.0.2svn58723-53.1.noarch.rpm"
RPM_HASH = "637f256b72f1c2d2efe70a179def9f50035bffb0244cf926ad3ab736ddbb3fe383b33cca0f4cd3b915014206dbf3d93a20d586a8db63b70ce308c7eaf1b98f73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridpapers.sty \
texlive-gridpapers"

RDEPENDS:${PN} += "/bin/sh \
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
