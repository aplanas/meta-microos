SUMMARY = "Easily typeset Control Block Diagrams and Signal Flow Graphs"
DESCRIPTION = "Kblocks defines a number of commands to make drawing control \
block diagrams using TikZ/PGF more structured and easier. It \
reduces the learning curve forTikZ/PGF and serves as a \
frontend, by focusing on the block resp. flow diagrams only."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn57617"

RPM_NAME = "texlive-kblocks-2023.201.2.0svn57617-55.1.noarch.rpm"
RPM_HASH = "5dabf0cd0c658a914d496f1106d0ab233d0d4f953841706762108964c2924d8e8c3eb594454884593ba2b09bb74560e91d0a1b6a8a2465ebe1cbc12df23e9d0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kblocks.sty \
texlive-kblocks"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-circuitikz.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
