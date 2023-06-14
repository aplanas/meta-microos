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

PV = "2023.201.2.1svn62946"

RPM_NAME = "texlive-istgame-2023.201.2.1svn62946-55.1.noarch.rpm"
RPM_HASH = "8ca701c0e34da84c0b34846885536ea490b35fd1c1610fa396816ee44b2c018824cabf72cd6c0d3264064e082441fee6fff68b387be914d5513f06ef0db441ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-istgame.sty \
texlive-istgame"

RDEPENDS:${PN} += "/bin/sh \
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
