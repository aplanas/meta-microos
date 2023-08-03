SUMMARY = "Bidi-aware coloured contour around text"
DESCRIPTION = "The package is a re-implementation of the contour package, \
making it bidi-aware, and adding support of the xdvipdfmx (when \
the outline option of the package is used)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn34631"

RPM_NAME = "texlive-bidicontour-2023.209.0.0.2svn34631-54.1.noarch.rpm"
RPM_HASH = "2a43eb06edb162afaa644e1e6d6880942be8875feaf4793e4eae3b182887184c069c8f92ab9d58a7f9825fb9600fabcdbd5c3af635d6c47097866b458eb7be38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidicontour.sty \
texlive-bidicontour"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-trig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
