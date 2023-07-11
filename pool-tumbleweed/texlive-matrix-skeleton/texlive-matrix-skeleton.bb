SUMMARY = "A PGF/TikZ library that simplifies working with multiple matrix nodes"
DESCRIPTION = "The package provides a PGF/TikZ library that simplifies working \
with multiple matrix nodes. To do so, it correctly aligns \
groups of nodes with the content of the whole matrix. \
Furthermore, matrix.skeleton provides rows and columns for easy \
styling."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn65013"

RPM_NAME = "texlive-matrix-skeleton-2023.208.1.1svn65013-53.1.noarch.rpm"
RPM_HASH = "4c8ab699db022d3275e381038c180c528cca61516e6500fa83762707ff89ab2ca1bf8c2562dcbadf09afe34084ca066e5592ebae1b573a4d08c2d4dde5bab88f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibrarymatrix.skeleton.code.tex \
tex-tikzlibrarymatrix.skeleton.code.tex \
texlive-matrix-skeleton"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
