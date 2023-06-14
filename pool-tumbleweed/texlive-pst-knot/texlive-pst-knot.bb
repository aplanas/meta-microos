SUMMARY = "PSTricks package for displaying knots"
DESCRIPTION = "The package can produce a fair range of knot shapes, with all \
the standard graphics controls one expects."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn16033"

RPM_NAME = "texlive-pst-knot-2023.201.0.0.2svn16033-52.1.noarch.rpm"
RPM_HASH = "092387e60fce292d45cdb52c13a1818d5ee3ce12137f4a4e8192bff75ce0013adfeecc1510f95b2a98cdfb6556acd3860dd24d6888758917177a00361ed02668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-knot.sty \
tex-pst-knot.tex \
texlive-pst-knot"

RDEPENDS:${PN} += "/bin/sh \
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
