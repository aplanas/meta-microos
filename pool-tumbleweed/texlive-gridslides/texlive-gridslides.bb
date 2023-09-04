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

RPM_NAME = "texlive-gridslides-2023.209.0.0.1.1svn54512-54.2.noarch.rpm"
RPM_HASH = "fd74eb3ef36757c1b706bc05a5c965d63ff4ebf817b8750a3b41e81b4ac0611ea0a6a4e45482d8fa6bcb238ada873138e2df901576a0621f785f0ecbca36d0a2"
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
