SUMMARY = "Draw fractal sets using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw the Julia and Mandelbrot \
sets, the Sierpinski triangle, Koch flake, and Apollonius \
Circle as well as fractal trees (which need not be balanced) \
with a variety of different parameters (including varying \
numbers of iterations). The package uses the pst-xkey package, \
part of the xkeyval distribution."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn64714"

RPM_NAME = "texlive-pst-fractal-2023.209.0.0.12svn64714-53.1.noarch.rpm"
RPM_HASH = "65238eeb144d2419367cb04480f690cb70edcc96fb26304e321f86ceedc3a7606f4727e47b8c923246b41ee9b0217ce96d520d9c75f1b2aa72c0c31a0e44a535"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-fractal.sty \
tex-pst-fractal.tex \
texlive-pst-fractal"

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
