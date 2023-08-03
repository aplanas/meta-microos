SUMMARY = "Display trees in the style of windows explorer"
DESCRIPTION = "This package is designed to emulate the way windows explorer \
displays directory and file trees, with the root at top left, \
and each level of subtree displaying one step in to the right. \
The macros work equally well with Plain TeX and with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.32svn42428"

RPM_NAME = "texlive-dirtree-2023.209.0.0.32svn42428-53.1.noarch.rpm"
RPM_HASH = "59c9f913214a687fdb4f75cd78432f83d27845902f0dfd10213c5f0bd722fca9fa90ad3de78e12099f3a369a13d59db2bfb5b837c28d92bb263bfbe389359f0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dirtree.sty \
tex-dirtree.tex \
texlive-dirtree"

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
