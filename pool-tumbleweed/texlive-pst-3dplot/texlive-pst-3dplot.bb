SUMMARY = "Draw 3D objects in parallel projection, using PSTricks"
DESCRIPTION = "A package using PSTricks to draw a large variety of graphs and \
plots, including 3D maths functions. Data can be read from \
external data files, making this package a generic tool for \
graphing within TeX/LaTeX, without the need for external tools."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.07asvn61615"

RPM_NAME = "texlive-pst-3dplot-2023.209.2.07asvn61615-53.1.noarch.rpm"
RPM_HASH = "0ee53f1d3694213f961ec6b0ab3f124f5d7fee4d8a0d9698721e8e7aa14279f37c5162ac0b4b7822ee77184730d38bcaed7c6f221ae9f3bee6d5e9ae69c6077b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-3dplot.sty \
tex-pst-3dplot.tex \
texlive-pst-3dplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-3d.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
