SUMMARY = "Free form slides with blocks placed on a grid"
DESCRIPTION = "This package allows creating free form slides with blocks \
placed on a grid. The blocks can be filled with text, \
equations, figures etc. The resulting slides are similar to the \
ones produced with LaTeX beamer, but more flexible. Sequential \
unconvering of elements is supported. A compiler script is \
provided which compiles each slide separately, this way \
avoiding long compile times."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn54512"

RPM_NAME = "texlive-gridslides-2023.209.0.0.1.1svn54512-54.1.noarch.rpm"
RPM_HASH = "7869f79d6a21a583d964da8a0efec20feee1d864b82a60140ba8454371b1750c8f42f136e89995061a7d95703d0bc44cc4e6adde6696fb8b5685b3f259e64cd0"
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
