SUMMARY = "Trees, using PSTricks"
DESCRIPTION = "pst-tree is a pstricks package that defines a macro \\pstree \
which offers a structured way of joining nodes created using \
pst-node in order to draw trees."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.14svn60421"

RPM_NAME = "texlive-pst-tree-2023.209.1.14svn60421-54.2.noarch.rpm"
RPM_HASH = "9df08146a3315fd46e4d8a9de854d4d0172ef1e280a9e59c69262bf712c855b13b26dac9342ad9dc804f8da51d4a056b8015b90f197e05925b88c283e5f21700"
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
