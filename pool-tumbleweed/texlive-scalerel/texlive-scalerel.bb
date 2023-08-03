SUMMARY = "Constrained scaling and stretching of objects"
DESCRIPTION = "The package provides four commands for vertically scaling and \
stretching objects. Its primary function is the ability to \
scale/stretch and shift one object to conform to the size of a \
specified second object. This feature can be useful in both \
equations and schematic diagrams. Additionally, the scaling and \
stretching commands offer constraints on maximum width and/or \
minimum aspect ratio, which are often used to preserve \
legibility or for the sake of general appearance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8svn42809"

RPM_NAME = "texlive-scalerel-2023.209.1.8svn42809-54.1.noarch.rpm"
RPM_HASH = "ea14c1788dfb729c1f5059703cbf9a738dc48ac55c49cd3903399f08b944ef8b88d2d6636d60821ac5a9af26cd9c9910b72a077c1cfc56d7f44bb91ed9471c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scalerel.sty \
texlive-scalerel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
