SUMMARY = "Trees, using PSTricks"
DESCRIPTION = "pst-tree is a pstricks package that defines a macro \\pstree \
which offers a structured way of joining nodes created using \
pst-node in order to draw trees."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.14svn60421"

RPM_NAME = "texlive-pst-tree-2023.201.1.14svn60421-53.1.noarch.rpm"
RPM_HASH = "a4bfba47cb67c165d93221926a2ca2935524f38565ebedcdaea15429e545837b21da229b9ce55db0942f3c489236864b7d80f8f992f5e5185ad086e7e3d982b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-tree.sty) \
tex(pst-tree.tex) \
texlive-pst-tree"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
