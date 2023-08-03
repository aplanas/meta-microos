SUMMARY = "A PSTricks package for rolling vehicles on graphs of mathematical functions"
DESCRIPTION = "This package permits to represent vehicles rolling without \
slipping on mathematical curves. Different types of vehicles \
are proposed, the shape of the curve is to be defined by its \
equation 'y=f(x)' in algebraic notation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn61438"

RPM_NAME = "texlive-pst-vehicle-2023.209.1.3svn61438-54.1.noarch.rpm"
RPM_HASH = "b1243560f42508b46f481584095f3037c8b99bf6b63c5d47a48da28c37d9d953de5b8af28a3137a955fbe48dc788cc3e7a2fab125bc9e92b809640943ae81be1"
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
