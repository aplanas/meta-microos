SUMMARY = "Draw quantum circuit diagrams"
DESCRIPTION = "The purpose of this package is to extend TikZ with the \
functionality for drawing quantum circuit diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.6svn54911"

RPM_NAME = "texlive-quantikz-2023.201.0.0.9.6svn54911-53.1.noarch.rpm"
RPM_HASH = "4e09adcae7533c276fb81e9c834276163737565eb377e8f55e1194653ef54f1d3300a4227aa4f7b94cd3a222b8badfe5fcb58cd1ed918a10d67e0e6f09a43d2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quantikz.sty \
tex-tikzlibraryquantikz.code.tex \
texlive-quantikz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
