SUMMARY = "A PGF/TikZ library that simplifies working with multiple matrix nodes"
DESCRIPTION = "The package provides a PGF/TikZ library that simplifies working \
with multiple matrix nodes. To do so, it correctly aligns \
groups of nodes with the content of the whole matrix. \
Furthermore, matrix.skeleton provides rows and columns for easy \
styling."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65013"

RPM_NAME = "texlive-matrix-skeleton-2023.201.1.1svn65013-52.1.noarch.rpm"
RPM_HASH = "1efba015ff57c4064f861a7f1b4886b2aee30a1e8c35fb77f0262e1bc1692bab6e631c9afbd0dcbe8196218f0018944f1806e5891da1db301fbb3452098aeddb"
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
