SUMMARY = "MetaPost macros for drawing cubic spline interpolants"
DESCRIPTION = "This is a small package of macros for creating cubic spline \
interpolants in MetaPost or Metafont. Given a list of points \
the macros can produce a closed or a relaxed spline joining \
them. Given a list of function values y_j at x_j, the result \
would define the graph of a cubic spline interpolating function \
y=f(x), which is either periodic or relaxed."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-splines-2023.209.0.0.2svn15878-58.1.noarch.rpm"
RPM_HASH = "2db1c4731106f13768e67f14e3d5b641b20268396838b60fbbacbfaa45322922d85411055ee75a7a42376c5a89b9740b94defea56a31e1dc0bc26cf08ed95b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splines"

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
