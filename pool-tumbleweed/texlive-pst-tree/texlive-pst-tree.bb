SUMMARY = "Trees, using PSTricks"
DESCRIPTION = "pst-tree is a pstricks package that defines a macro \\pstree \
which offers a structured way of joining nodes created using \
pst-node in order to draw trees."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.14svn60421"

RPM_NAME = "texlive-pst-tree-2023.201.1.14svn60421-53.2.noarch.rpm"
RPM_HASH = "e96c63b55f4472cd08ddd7780aba9ad206a568b982044a06bc4dfd764ccbcec48e8251996825eb11ee4baa31f914b40f9863959b73cc4726cfc51250bd9d5ac8"
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
