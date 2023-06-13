SUMMARY = "Draw 3D objects in parallel projection, using PSTricks"
DESCRIPTION = "A package using PSTricks to draw a large variety of graphs and \
plots, including 3D maths functions. Data can be read from \
external data files, making this package a generic tool for \
graphing within TeX/LaTeX, without the need for external tools."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.07asvn61615"

RPM_NAME = "texlive-pst-3dplot-2023.201.2.07asvn61615-52.1.noarch.rpm"
RPM_HASH = "b6c24b34db1d28dbcdf9abc1d4abe04191c842a673309ce1c45a9f0bc41ad66da2825a21262bbeb1e5f43c233b662091aa33fd1fbb3ffc8214f4ad4dc1660f1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-3dplot.sty) \
tex(pst-3dplot.tex) \
texlive-pst-3dplot"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(multido.sty) \
tex(pst-3d.sty) \
tex(pst-node.sty) \
tex(pst-plot.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
