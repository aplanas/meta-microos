SUMMARY = "Draw implicit functions using the 'marching squares' algorithm"
DESCRIPTION = "This package allows to draw implicit functions 'f(x,y) = 0' \
with options for coloring the inside of the surfaces, for \
marking the points and arrowing the curve at points chosen by \
the user. The package uses the 'marching squares' algorithm."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn48230"

RPM_NAME = "texlive-pst-contourplot-2023.209.0.0.6svn48230-53.1.noarch.rpm"
RPM_HASH = "b72239bd85808f9440ff01fb794f2259b4aa569b718a7d2d5d57e28481472aa6935e6d316a4ebf799bcd7015e58d8681a550c2495da0d19b0f1fdd7f560164a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-contourplot.sty \
tex-pst-contourplot.tex \
texlive-pst-contourplot"

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
