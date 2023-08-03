SUMMARY = "Graph-drawing for neural networks"
DESCRIPTION = "The package provides facilities for graph-drawing, with \
facilities designed for neural network diagrams."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn31500"

RPM_NAME = "texlive-neuralnetwork-2023.209.1.0svn31500-55.1.noarch.rpm"
RPM_HASH = "f1dda03ab61c7f79b6b9be81d92cd8a188b5a012495f87bbe83c0d9c7d859f5c0c61e3a76138d9964b7854fa496f1e398eaa204c728995e78bb7a995159cb326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-neuralnetwork.sty \
texlive-neuralnetwork"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algorithmicx.sty \
tex-environ.sty \
tex-etoolbox.sty \
tex-mathtools.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
