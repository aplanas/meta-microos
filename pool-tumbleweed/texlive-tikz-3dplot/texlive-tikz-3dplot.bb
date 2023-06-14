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

PV = "2023.201.svn25087"

RPM_NAME = "texlive-tikz-3dplot-2023.201.svn25087-54.1.noarch.rpm"
RPM_HASH = "dd1945c2ab59d8f59be9ed4159e7ea250e77d27cdba298357640ce8aa8107454768c012e5cc9fbf6ee2aed07361d21eba902ec05ed1b8446e70b2d52f452fc4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-3dplot.sty \
texlive-tikz-3dplot"

RDEPENDS:${PN} += "/bin/sh \
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
