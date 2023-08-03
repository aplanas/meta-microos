SUMMARY = "Coordinate transformation styles for 3d plotting in TikZ"
DESCRIPTION = "The package provides straightforward ways to define \
three-dimensional coordinate frames through which to plot in \
TikZ. The user can specify the orientation of the main \
coordinate frame, and use standard TikZ commands and \
coordinates to render their tikzfigure. A secondary coordinate \
frame is provided to allow rotations and translations with \
respect to the main coordinate frame. In addition, the package \
can also handle plotting user-specified functions in spherical \
polar coordinates, where both the radius and fill color can be \
expressed as parametric functions of polar angles."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn25087"

RPM_NAME = "texlive-tikz-3dplot-2023.209.svn25087-55.1.noarch.rpm"
RPM_HASH = "e52ba22b5ed7b90cd2ba58632d5e11293da09629ace16c10b151a84e16c209ef3482fda5a8fa5767258fc22262702c56244e3c02d5c2e0ff3352efe066ad459f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-3dplot.sty \
texlive-tikz-3dplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
