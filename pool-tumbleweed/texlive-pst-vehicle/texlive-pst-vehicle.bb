SUMMARY = "A PSTricks package for rolling vehicles on graphs of mathematical functions"
DESCRIPTION = "This package permits to represent vehicles rolling without \
slipping on mathematical curves. Different types of vehicles \
are proposed, the shape of the curve is to be defined by its \
equation 'y=f(x)' in algebraic notation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-2023.201.1.3svn61438-53.1.noarch.rpm"
RPM_HASH = "fd093f86699ba999992d6f62375e5316b5815d6bc9b6202676c6c5c270f73b0e16f323457bd91f5e959cb70852401e6022b720d5889d5903a0b17cbf4280d02a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-vehicle.sty) \
tex(pst-vehicle.tex) \
texlive-pst-vehicle"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
