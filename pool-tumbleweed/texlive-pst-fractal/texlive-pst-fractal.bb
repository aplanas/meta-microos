SUMMARY = "Draw fractal sets using PSTricks"
DESCRIPTION = "The package uses PSTricks to draw the Julia and Mandelbrot \
sets, the Sierpinski triangle, Koch flake, and Apollonius \
Circle as well as fractal trees (which need not be balanced) \
with a variety of different parameters (including varying \
numbers of iterations). The package uses the pst-xkey package, \
part of the xkeyval distribution."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12svn64714"

RPM_NAME = "texlive-pst-fractal-2023.201.0.0.12svn64714-52.1.noarch.rpm"
RPM_HASH = "f34be150b081ece27d0a2c684f2c51f407c405680f323dca7ef8f9ef61cafcd6840c5abd96a52af898727d3ed62f4d31fb4664435f33d1ca5ef99e51652e28a5"
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
