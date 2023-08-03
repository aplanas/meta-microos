SUMMARY = "Use existing qtree syntax for trees in TikZ"
DESCRIPTION = "The package provides a macro for drawing trees with TikZ using \
the easy syntax of Alexis Dimitriadis' Qtree. It improves on \
TikZ's standard tree-drawing facility by laying out tree nodes \
without collisions; it improves on Qtree by adding lots of \
features from TikZ (for example, edge labels, arrows between \
nodes); and it improves on pst-qtree in being usable with \
pdfTeX and XeTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2svn26108"

RPM_NAME = "texlive-tikz-qtree-2023.209.1.2svn26108-53.1.noarch.rpm"
RPM_HASH = "d7cabce58c15e6c663e4825502f8db6b0443ea3bd0dd5ac7e62886c7b253f54bd8e8c7108ef4efa3ff7b5d35b90f79a7bd042360bca7bcd7c709e809bf241ef3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfsubpic.sty \
tex-pgfsubpic.tex \
tex-pgftree.sty \
tex-pgftree.tex \
tex-tikz-qtree-compat.sty \
tex-tikz-qtree.sty \
tex-tikz-qtree.tex \
texlive-tikz-qtree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
tex-pgffor.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
