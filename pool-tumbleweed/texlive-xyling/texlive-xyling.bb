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

RPM_NAME = "texlive-xyling-2023.209.1.1svn15878-53.2.noarch.rpm"
RPM_HASH = "5c7d8bbf562b13931768f353eafc4ff79a5abb443f5e2421d88728ab1b4df4014c218baea9603480dee730fd5f1289a015027776656a4c69318bd1ab347378a8"
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
