SUMMARY = "Typesetting menus"
DESCRIPTION = "The package defines command \\menu which assists typesetting of \
a path through a program's menu."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.994svn15878"

RPM_NAME = "texlive-menu-2023.209.0.0.994svn15878-55.1.noarch.rpm"
RPM_HASH = "08efd49466946e04ef82d2e911ffc8bd70641b722f00f60eb07aef51f572b57cee2d0bc06e6ca58e2e3d499332b6dd6297f5b96d3a18cca33e5850f1040a6494"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-menu.sty \
texlive-menu"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bbding.sty \
tex-color.sty \
tex-fancybox.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
