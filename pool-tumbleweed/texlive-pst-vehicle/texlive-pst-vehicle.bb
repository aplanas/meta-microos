SUMMARY = "A PSTricks package for rolling vehicles on graphs of mathematical functions"
DESCRIPTION = "This package permits to represent vehicles rolling without \
slipping on mathematical curves. Different types of vehicles \
are proposed, the shape of the curve is to be defined by its \
equation 'y=f(x)' in algebraic notation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-2023.209.1.3svn61438-54.2.noarch.rpm"
RPM_HASH = "77af2d2436cc8f7dd214b5ddb03bcdb54837803d73c5c3eb375cad4f412c996e596687b9d62bbca74de567c1c65ecc4a7c28f1e7561f46873f06aa4cd1c49fcd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-vehicle.sty \
tex-pst-vehicle.tex \
texlive-pst-vehicle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
