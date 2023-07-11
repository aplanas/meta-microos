SUMMARY = "A PSTricks package for rolling vehicles on graphs of mathematical functions"
DESCRIPTION = "This package permits to represent vehicles rolling without \
slipping on mathematical curves. Different types of vehicles \
are proposed, the shape of the curve is to be defined by its \
equation 'y=f(x)' in algebraic notation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-2023.201.1.3svn61438-53.2.noarch.rpm"
RPM_HASH = "3d182acc39ffc62c89f115f68e2c240666ecb877eaa9516c1ed6bc7483178bf5ffcd2d02077316e1ba0e0f51d88948d070c777ff95dbe5e9a9d19d5a7d575cf3"
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
