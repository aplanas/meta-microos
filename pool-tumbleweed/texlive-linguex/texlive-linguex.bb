SUMMARY = "Format linguists' examples"
DESCRIPTION = "This bundle comprises two packages: The linguex package \
facilitates the formatting of linguist examples, automatically \
taking care of example numbering, indentations, indexed \
brackets, and the '*' in grammaticality judgments. The ps-trees \
package provides linguistic trees, building on the macros of \
tree-dvips, but overcoming some of the older package's \
shortcomings."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.3svn30815"

RPM_NAME = "texlive-linguex-2023.209.4.3svn30815-55.1.noarch.rpm"
RPM_HASH = "318556cf5d1655529c35c159ec98cc5b3d7d34eb26f9773a2043ddaf4107839aa31ab16b62dabc14370ec8475c3dbcb4fc0a20c238003a78635c5cf9c921dacd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linguex.sty \
tex-linguho.sty \
tex-ps-trees.sty \
texlive-linguex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cgloss4e.sty \
tex-tree-dvips.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
