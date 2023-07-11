SUMMARY = "Simple syntax for trees"
DESCRIPTION = "The package provides a qtree-like front end for PSTricks."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pst-qtree-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "bf36c0ade20cab633f8eeec946a769178579265c642196ea5abe42dc5008608141bb5b18f41c4b56a851365b4e64695a45a80f1dedefca4e1aad82f967978420"
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
