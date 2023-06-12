SUMMARY = "Drawing optics diagrams"
DESCRIPTION = "A package for drawing both reflective and refractive optics \
diagrams. The package requires pstricks later than version \
1.10."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn62977"

RPM_NAME = "texlive-pst-optic-2023.201.1.02svn62977-52.1.noarch.rpm"
RPM_HASH = "53b3bbf45e160eabb9ff2bb3021326a947faf588c83da546531bfbb42b5ed114e2cb4df3264b6821afeb006b0c042757de1308d144d83b36fb3190c469d06375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-optic.sty) \
tex(pst-optic.tex) \
texlive-pst-optic"
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
