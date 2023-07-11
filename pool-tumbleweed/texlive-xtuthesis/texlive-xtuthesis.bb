SUMMARY = "XTU thesis template"
DESCRIPTION = "The package provides a thesis template for the Xiangtan \
University."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-2023.201.1.0svn47049-52.2.noarch.rpm"
RPM_HASH = "0e505692145c5a8d54682abcd7760c333978401d442f2dbd780cb8a0d76131f434b8dff242f2ab65759244d990f0f35629cad7cec694a7fd182664f794e797c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtuformat.sty \
texlive-xtuthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithm2e.sty \
tex-amscd.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-bm.sty \
tex-caption.sty \
tex-cite.sty \
tex-color.sty \
tex-graphicx.sty \
tex-latexsym.sty \
tex-mathrsfs.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
