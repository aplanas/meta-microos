SUMMARY = "A reimplementation of the LaTeX for-loop macro"
DESCRIPTION = "The package redefines the LaTeX internal \\@for macro so that \
the loop may be prematurely terminated. The action is akin to \
the C/Java break statement, except that the loop does not \
terminate until the end of the current iteration"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.05svn15878"

RPM_NAME = "texlive-xfor-2023.209.1.05svn15878-53.2.noarch.rpm"
RPM_HASH = "31df010ce9bd22e0ab22f2573fffe83ae5653bd817cea9f1a7c8530db89b6a24af7b90b6e381c5fb7459d25ac7d7381ff449444ab7e9dc1972e0c2e48dd5c6d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xfor.sty \
texlive-xfor"

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
