SUMMARY = "MetaPost macros for drawing cubic spline interpolants"
DESCRIPTION = "This is a small package of macros for creating cubic spline \
interpolants in MetaPost or Metafont. Given a list of points \
the macros can produce a closed or a relaxed spline joining \
them. Given a list of function values y_j at x_j, the result \
would define the graph of a cubic spline interpolating function \
y=f(x), which is either periodic or relaxed."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-splines-2023.201.0.0.2svn15878-57.1.noarch.rpm"
RPM_HASH = "7dade995abcd2eb149d489525a701c063de27fa89aef930b0a2db0de0a8267c70ae137f3dbb19ea1d120775f8cbff6ee7ecd6a70915725d5e5bf4428a820cbad"
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
