SUMMARY = "Nodes and node connections in PSTricks"
DESCRIPTION = "The package enables the user to connect information, and to \
place labels, without knowing (in advance) the actual positions \
of the items to be connected, or where the connecting line \
should go. The macros are useful for making graphs and trees, \
mathematical diagrams, linguistic syntax diagrams, and so on. \
The package contents were previously distributed as a part of \
the pstricks base distribution; the package serves as an \
extension to PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.43svn61838"

RPM_NAME = "texlive-pst-node-2023.209.1.43svn61838-53.1.noarch.rpm"
RPM_HASH = "acf84ade873b1304ed1222c17203043531a8114740db1dbb7a68f0ddf17fefe2eb7ea49b0d814aa5dbd55587a2801691c9fd0955e4e3ec364464487e4c52612d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-node.sty \
tex-pst-node.tex \
tex-pst-node97.tex \
texlive-pst-node"

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
