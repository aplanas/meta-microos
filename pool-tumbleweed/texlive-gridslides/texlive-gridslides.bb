SUMMARY = "Free form slides with blocks placed on a grid"
DESCRIPTION = "This package allows creating free form slides with blocks \
placed on a grid. The blocks can be filled with text, \
equations, figures etc. The resulting slides are similar to the \
ones produced with LaTeX beamer, but more flexible. Sequential \
unconvering of elements is supported. A compiler script is \
provided which compiles each slide separately, this way \
avoiding long compile times."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-2023.201.0.0.1.1svn54512-53.2.noarch.rpm"
RPM_HASH = "cfbaa57dac30ddd8e3ec06ea9622b54ec678a99c0dbac1a3a2c20d4e3a2c6fb992a9403765abf81502607ae2b947db0919e5b22e50d9f2ca18dbc5b01ab8e436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gridslides.cls \
tex-gridslides.sty \
texlive-gridslides"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-babel.sty \
tex-braket.sty \
tex-dsfont.sty \
tex-enumerate.sty \
tex-environ.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-ragged2e.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xspace.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
