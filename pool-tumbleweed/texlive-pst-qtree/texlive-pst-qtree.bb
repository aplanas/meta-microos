SUMMARY = "Simple syntax for trees"
DESCRIPTION = "The package provides a qtree-like front end for PSTricks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pst-qtree-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "0e70af8e77bc23af5b62e1704328fd25186bc5ee3bf5c43906b2c12bae1353a31b6fb41557b5adf6058ccd004e9711cd65f8c915c3116c171729eb1254799cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-qtree.sty \
tex-pst-qtree.tex \
texlive-pst-qtree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pst-node.sty \
tex-pst-tree.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
