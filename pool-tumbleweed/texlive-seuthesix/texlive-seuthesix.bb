SUMMARY = "LaTeX class for theses at Southeast University, Nanjing, China"
DESCRIPTION = "This project provides a LaTeX document class as well as a \
bibliography style file for typesetting theses at the Southeast \
University, Nanjing, China. It is based on the seuthesis \
package which, according to the author of seuthesix, is buggy \
and has not been maintained for some time."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0.1svn40088"

RPM_NAME = "texlive-seuthesix-2023.209.1.0.1svn40088-54.1.noarch.rpm"
RPM_HASH = "b7df3583d0b024abf631f74688564e113ce5c49d1621b07f652deb45c8b31ad371dbb58270bd8fac9c32ba71f8b21bd3b85a31d3af8de717f7dabe18cea34236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-seuthesix.cfg \
tex-seuthesix.cls \
texlive-seuthesix"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm.sty \
tex-algorithmic.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-caption.sty \
tex-ctexrep.cls \
tex-eso-pic.sty \
tex-eucal.sty \
tex-eufrak.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-natbib.sty \
tex-nomencl.sty \
tex-tocloft.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
