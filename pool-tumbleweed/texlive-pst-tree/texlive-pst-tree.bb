SUMMARY = "Trees, using PSTricks"
DESCRIPTION = "pst-tree is a pstricks package that defines a macro \\pstree \
which offers a structured way of joining nodes created using \
pst-node in order to draw trees."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.14svn60421"

RPM_NAME = "texlive-pst-tree-2023.209.1.14svn60421-54.1.noarch.rpm"
RPM_HASH = "75f4afbc72ab4f7846135b722fa5b73df9799e7600f617799803c5810b460293af96a9d9c2ac6f685d2795ebb1ce1d9a613d9534dc3b5d160c1c03ad19a0c49a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tree.sty \
tex-pst-tree.tex \
texlive-pst-tree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
