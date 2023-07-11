SUMMARY = "Draw syntactic trees, etc., for linguistics literature, using xy-pic"
DESCRIPTION = "The macros in this package model the construction of linguistic \
tree structures as a genuinely graphical problem: they contain \
two types of objects, BRANCHES and NODE LABELS, and these are \
positioned relative to a GRID. It is essential that each of \
these three elements is constructed independent of the other \
two, and hence they can be modified without unwanted side \
effects. The macros are based on the xy-pic package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-xyling-2023.201.1.1svn15878-52.2.noarch.rpm"
RPM_HASH = "382cf68bdc9573b72074811b2c1260f5a767e76b88d35ddfe2ca3ade5a36c68f5bac5f46627ab8fd2cf62437dd80e2841a334c94267d3acf5b85d427b5c807d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xyling.sty \
texlive-xyling"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-ifthen.sty \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
