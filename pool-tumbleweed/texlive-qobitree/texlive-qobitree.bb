SUMMARY = "LaTeX macros for typesetting trees"
DESCRIPTION = "Provides commands \\branch and \\leaf for specifying the elements \
of the tree; you build up your tree with those commands, and \
then issue the \\tree command to typeset the whole."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qobitree-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "ab89fe3ad403d2abd346d558bd5c53fd4f078a89aa8c12e141c801f7e24a1641422a2118cba6304dc0dccbdcfb9a7e5f5398f01bc54a5988033d6154233de853"
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
