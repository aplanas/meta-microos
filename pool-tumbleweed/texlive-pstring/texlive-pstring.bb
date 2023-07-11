SUMMARY = "Typeset sequences with justification pointers"
DESCRIPTION = "This package lets you typeset justified sequences, also called \
pointing strings. It's used for instance, in research papers \
about Game Semantics to represent sequence of game moves with \
their associated justification pointers. Depending on wether \
using LaTeX or pdfLaTeX, the package uses PSTricks and pst-node \
respectively pgf/TikZ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn42857"

RPM_NAME = "texlive-pstring-2023.201.svn42857-53.2.noarch.rpm"
RPM_HASH = "ee97143a4a750231c9d7dc187d68a90660afcee26569e1aa99bb3fd8284b96cb2b0a60a77f50c463d07d16356c567ea2e055e257b8811c63261c4457f14ef693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pstring.sty \
texlive-pstring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifpdf.sty \
tex-pgfcore.sty \
tex-pst-node.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
