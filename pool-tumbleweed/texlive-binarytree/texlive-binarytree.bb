SUMMARY = "Drawing binary trees using TikZ"
DESCRIPTION = "This package provides an easy but flexible way to draw binary \
trees using TikZ. A path specification and the setting of \
various options determine the style for each edge of the tree. \
There is support for the external library of TikZ which does \
not affect externalization of the rest of the TikZ figures in \
the document. There is an option to use automatic file naming: \
useful if the trees are often moved around."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn41777"

RPM_NAME = "texlive-binarytree-2023.209.1.01svn41777-54.1.noarch.rpm"
RPM_HASH = "fe4ec3cf44d6a06d2d85dbcbc4e0e18e053287068bdf433ced01947e7de0d841bdc7e8b9abe4a3ee4bb990c30823b431c2d0ad93ee69fb5b4a4ba7a97c6028bb"
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
