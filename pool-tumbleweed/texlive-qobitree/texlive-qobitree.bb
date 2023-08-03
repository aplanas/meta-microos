SUMMARY = "LaTeX macros for typesetting trees"
DESCRIPTION = "Provides commands \\branch and \\leaf for specifying the elements \
of the tree; you build up your tree with those commands, and \
then issue the \\tree command to typeset the whole."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qobitree-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e86abb5951133fa52ab7ce56117441e5a426a4ccfdae8e48876012b5b0036b3ee2f4d5bbea8e0dc2bd7a844b3a4f6868bbad5dee3af33f9fa0d43e7f445975e2"
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
