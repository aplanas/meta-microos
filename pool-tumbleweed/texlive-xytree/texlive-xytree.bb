SUMMARY = "Tree macros using XY-Pic"
DESCRIPTION = "The package provides means to draw linguistic syntactic trees \
with ease and to support hopefully sufficient functionalities, \
that the linguist may need. The package (of course) depends on \
the XY-Pic package."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-xytree-2023.209.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "47bb31fb266dccbaccec7660930d88037af6e8115062e7328632dc42dd2e640be2379548e582dee5f939544c3ca452b81b929eb026dd84be98a31a99a3d5987d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xytree.sty \
texlive-xytree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xy.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
