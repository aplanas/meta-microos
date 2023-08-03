SUMMARY = "Thesis Template of Shandong University"
DESCRIPTION = "Thesis Template of Shandong University."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn41401"

RPM_NAME = "texlive-sduthesis-2023.209.1.2.1svn41401-54.1.noarch.rpm"
RPM_HASH = "6a0dcb78255e5ba9ca0e27d9e3c78a7e5ce9d5fc7d5d219fff770461e48dda0e44b18cd6a043fe4337ed47d2d2dd771c747a4f3ad27670790ccfab0bf067cedf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sduthesis-cover.def \
tex-sduthesis-statement.def \
tex-sduthesis.cls \
texlive-sduthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bm.sty \
tex-bmpsize.sty \
tex-booktabs.sty \
tex-ctexbook.cls \
tex-epstopdf.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-makecell.sty \
tex-mathrsfs.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
