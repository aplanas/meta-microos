SUMMARY = "A beamer theme with 4 colour palettes"
DESCRIPTION = "The package contains a theme for Beamer which is referenced as \
'Cuerna' inside beamer and has four basic colour themes. The \
title page shows rectangles that represent the Fibonacci \
sequence, and spiral is drawn on top of the rectangles. Besides \
that the rest of the graphic elements in the slides are scarce \
to keep it clean"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42161"

RPM_NAME = "texlive-beamertheme-cuerna-2023.209.svn42161-54.1.noarch.rpm"
RPM_HASH = "bfd521ffe16e04bd3f3906686de3ae2325147be01c239945b70eb5bee1bad5224f45a0ceb9340ade21aae70aa5de033073dae69b6fab989f7ddbe0382fb3282b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemeCuerna.sty \
tex-beamercolorthemebluesimplex.sty \
tex-beamercolorthemebrick.sty \
tex-beamercolorthemelettuce.sty \
tex-beamerinnerthemeCuerna.sty \
tex-beamerouterthemeCuerna.sty \
tex-beamerthemeCuerna.sty \
texlive-beamertheme-cuerna"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-graphicx.sty \
tex-lmodern.sty \
tex-textpos.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
