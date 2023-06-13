SUMMARY = "LaTeX macros for typesetting trees"
DESCRIPTION = "Provides commands \\branch and \\leaf for specifying the elements \
of the tree; you build up your tree with those commands, and \
then issue the \\tree command to typeset the whole."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-qobitree-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "d1850415bb8577a43725ca1bdca687b2fed3a3d85f3f3a38ffd672c1630e15457330493c49637af51da3785595c61b7fba7a36efd0abc2b0f7c24626253b99d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(qobitree.tex) \
texlive-qobitree"

RDEPENDS:${PN} += "/bin/sh \
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
