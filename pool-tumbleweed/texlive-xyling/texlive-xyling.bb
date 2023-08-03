SUMMARY = "Draw syntactic trees, etc., for linguistics literature, using xy-pic"
DESCRIPTION = "The macros in this package model the construction of linguistic \
tree structures as a genuinely graphical problem: they contain \
two types of objects, BRANCHES and NODE LABELS, and these are \
positioned relative to a GRID. It is essential that each of \
these three elements is constructed independent of the other \
two, and hence they can be modified without unwanted side \
effects. The macros are based on the xy-pic package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-xyling-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "3cea1314f3fd979a525819b96b52241fe05e6626d0de41160cd1a27306520aef4e26c5f0b806fa2589e55e3dd15616c88f9cf6e87424c2073260be27e37b556b"
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
