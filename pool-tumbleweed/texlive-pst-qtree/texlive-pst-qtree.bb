SUMMARY = "Simple syntax for trees"
DESCRIPTION = "The package provides a qtree-like front end for PSTricks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pst-qtree-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "296038247ded39f5fbe52f66c4df7832a86f3f216f0c9fa469efbfaf515b271d2a01b64c6dfeb6401a7becb944d00b6e4557b1386cdbd86c3b322fa31628c138"
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
