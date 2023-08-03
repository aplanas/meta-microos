SUMMARY = "Draws electrocardiograms (ECG)"
DESCRIPTION = "This package provides the \\ECG{<code>} command which draws \
electrocardiograms (ECG). The <code> represents a series of \
abbreviations which allow to draw different types of wave."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41617"

RPM_NAME = "texlive-ecgdraw-2023.209.0.0.1svn41617-54.1.noarch.rpm"
RPM_HASH = "61319aa9109d3d269faf48c9f089cbbe7db639f00842a8bfaa1b018deaeaf975cbf96c69c6a8d6b41af1b49403d4ffbf54e6cc3c5fc0600c048780cce712cfa7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecgdraw.sty \
texlive-ecgdraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
