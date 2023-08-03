SUMMARY = "A LaTeX class for theses at the Faculty Of Graphic Arts in Zagreb"
DESCRIPTION = "This class is intended for generating graduate and final theses \
according to the instructions of the Faculty of Graphic Arts, \
University of Zagreb. It does not necessarily correspond to the \
requirements of each component of the University, but is \
designed as an idea for linking and uniformizing the look of \
all graduate papers. Anyone who likes it is welcome to use it."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51647"

RPM_NAME = "texlive-unizgklasa-2023.209.1.0svn51647-54.1.noarch.rpm"
RPM_HASH = "a38c6f3fae0a343a67c76ff569bf1f5ee3eeb654a58e10a1d730c1ad290e9267daeb90fff36a2d0f7e2fa47540056bf8db89c57908d7fddb03925314736d9433"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unizgklasa.cls \
texlive-unizgklasa"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-caption.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-subcaption.sty \
tex-titlesec.sty \
tex-tocbibind.sty \
tex-upgreek.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
