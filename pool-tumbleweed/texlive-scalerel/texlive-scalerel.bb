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

PV = "2023.201.1.8svn42809"

RPM_NAME = "texlive-scalerel-2023.201.1.8svn42809-53.1.noarch.rpm"
RPM_HASH = "c82518b0987a84ef6086fb8d800c31807ba5dc1f30ff782a8e79fe8d8c24f9baf1cef2a752c2d3fcd96fef4d7a48e1b3417c93ad4b3546c3f631cf9366ab2aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scalerel.sty \
texlive-scalerel"

RDEPENDS:${PN} += "/bin/sh \
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
