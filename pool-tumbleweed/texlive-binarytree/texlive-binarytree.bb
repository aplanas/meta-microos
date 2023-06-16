SUMMARY = "Drawing binary trees using TikZ"
DESCRIPTION = "This package provides an easy but flexible way to draw binary \
trees using TikZ. A path specification and the setting of \
various options determine the style for each edge of the tree. \
There is support for the external library of TikZ which does \
not affect externalization of the rest of the TikZ figures in \
the document. There is an option to use automatic file naming: \
useful if the trees are often moved around."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn41777"

RPM_NAME = "texlive-binarytree-2023.201.1.01svn41777-53.1.noarch.rpm"
RPM_HASH = "ef89c0750fd6e83cbe94552a8de0f4c74a73a3b3cd80f200386de38a53e9c2664ee9e4a373571f22ab5e76b8f7445c2deaf225e27f3cd622f096c33ad37faac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-binarytree.sty \
texlive-binarytree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
