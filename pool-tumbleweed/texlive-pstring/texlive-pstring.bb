SUMMARY = "Typeset sequences with justification pointers"
DESCRIPTION = "This package lets you typeset justified sequences, also called \
pointing strings. It's used for instance, in research papers \
about Game Semantics to represent sequence of game moves with \
their associated justification pointers. Depending on wether \
using LaTeX or pdfLaTeX, the package uses PSTricks and pst-node \
respectively pgf/TikZ."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn42857"

RPM_NAME = "texlive-pstring-2023.209.svn42857-54.1.noarch.rpm"
RPM_HASH = "6e32f855435297acae2b257e33cb24f4341a42f42a899036886bfb90450610e2c219f13edb56967188139b7c8808e5358d987eb0487c781e8c43fe284d6e8382"
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
