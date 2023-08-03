SUMMARY = "Draw quantum circuit diagrams"
DESCRIPTION = "The purpose of this package is to extend TikZ with the \
functionality for drawing quantum circuit diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.6svn54911"

RPM_NAME = "texlive-quantikz-2023.209.0.0.9.6svn54911-54.1.noarch.rpm"
RPM_HASH = "8a383fadaaeb4f98c40323ded8073b783166989930ece88ee575238136b23a416490447f817ee806b1324d70bea9de9148f11962fec04ad66d5ea0ffed073e63"
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
