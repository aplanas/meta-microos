SUMMARY = "XTU thesis template"
DESCRIPTION = "The package provides a thesis template for the Xiangtan \
University."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-2023.209.1.0svn47049-53.2.noarch.rpm"
RPM_HASH = "9a2193489ed92e22378c58150c7183f6b03fa2fab909ee37e814d02131c0d4fe4d80aded1a7842b30dbb0c1724f1fa71bfa04809a0f879ea9b1f12fabe22cb92"
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
