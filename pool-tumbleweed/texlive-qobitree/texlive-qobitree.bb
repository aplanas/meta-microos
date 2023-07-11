SUMMARY = "LaTeX macros for typesetting trees"
DESCRIPTION = "Provides commands \\branch and \\leaf for specifying the elements \
of the tree; you build up your tree with those commands, and \
then issue the \\tree command to typeset the whole."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qobitree-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "a25b1b426661082f811e17887ad045a52032312da1e1ff40d3617306c808302c58ac3c72947bb300fec2d7b050246780ef5d44b8bec5366e81275ef533f990bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qobitree.tex \
texlive-qobitree"

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
