SUMMARY = "Template for a zbMATH Open review"
DESCRIPTION = "This package contains a template for zbMATH Open reviews. It \
will show what your review will look like on zbMATH Open and \
you can test whether your LaTeX-Code will compile on our \
system. The template has to be compiled using XeLaTeX and \
relies on scrartcl, scrlayer-scrpage, amsfonts, amssymb, \
amsmath, babel, enumitem, etoolbox, fontspec, gensymb, \
geometry, graphicx, mathrsfs, mathtools, stmaryrd, textcomp, \
tikz-cd, xcolor, and xparse."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn59693"

RPM_NAME = "texlive-zbmath-review-template-2023.209.2.1svn59693-53.2.noarch.rpm"
RPM_HASH = "9d49ea468792ae13c9cf7011a775e430dd4e909fdd11002dad2863d92038198ae4026a6bfc3ece308026ea7b66dcdf8b134217285b575355bf4670d64aae1b8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zb-basics.sty \
tex-zbMATH.cls \
texlive-zbmath-review-template"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-gensymb.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-stmaryrd.sty \
tex-textcomp.sty \
tex-tikz-cd.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
