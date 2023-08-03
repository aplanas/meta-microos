SUMMARY = "Draw 3-dimensional framed boxes using PSTricks"
DESCRIPTION = "A package using PSTricks to draw three dimensional framed boxes \
using a macro \\PstFrameBoxThreeD. The macro is especially \
useful for drawing 3d-seeming buttons."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn15878"

RPM_NAME = "texlive-pst-fr3d-2023.209.1.10svn15878-53.1.noarch.rpm"
RPM_HASH = "ee359f9e87b784440dc6614e9b64df01cee00e5b65819459001a4ad3eda7275b03b35c6abf2de2d45be483e77e5ab3c99c5f3e12fdb659910aa3c3f6e47dd970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fr3d.sty \
tex-pst-fr3d.tex \
texlive-pst-fr3d"

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
