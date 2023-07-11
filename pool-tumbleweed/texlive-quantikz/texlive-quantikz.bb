SUMMARY = "Draw quantum circuit diagrams"
DESCRIPTION = "The purpose of this package is to extend TikZ with the \
functionality for drawing quantum circuit diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.6svn54911"

RPM_NAME = "texlive-quantikz-2023.201.0.0.9.6svn54911-53.2.noarch.rpm"
RPM_HASH = "cdc799fc98363683c929902ed1159badd220b9e886863b758ebe2bb2fcf87481670ef88f766b9aa5bf08e5083f4760f979fb37b87802040c3ac639821bc7d63a"
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
