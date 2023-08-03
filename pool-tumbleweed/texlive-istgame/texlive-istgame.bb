SUMMARY = "Draw Game Trees with TikZ"
DESCRIPTION = "This LaTeX package provides macros based on TikZ to draw a game \
tree. The main idea underlying its core macros is the \
completion of a whole tree by using a sequence of simple \
'parent-child' tree structures, with no longer nested relations \
involved (like the use of 'grandchildren' or \
'great-grandchildren'). Using this package you can draw a game \
tree as easily as drawing a game tree with pen and paper. This \
package depends on expl3, TikZ, and xparse. The 'ist' prefix \
stands for 'it's a simple tree' or 'In-Sung's simple tree.'"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn62946"

RPM_NAME = "texlive-istgame-2023.209.2.1svn62946-56.1.noarch.rpm"
RPM_HASH = "85dd4e69538901c84f7feb917d9b7bc37d8c402bd1e248f20f57c329dc4e8b6fa1baf3d5c95f6875021466b2fc280f916c2f6cec835f8803e41f6576afcd11b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-istgame.sty \
texlive-istgame"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
