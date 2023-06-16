SUMMARY = "Define missing colors by their names"
DESCRIPTION = "This package makes it possible to define colors automatically \
by their names. This can be useful in drawing TikZ pictures and \
designing beamer themes. Using the package, you don't need to \
write \\definecolor before using a color."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn41042"

RPM_NAME = "texlive-coloring-2023.201.0.0.2svn41042-53.1.noarch.rpm"
RPM_HASH = "89c5ecd0c025889332ef9ce4b30752b89905e9672ecb1e2e1fb90b246c16fe19f32ef8532d38391d5cfac47428efd6612468d32f218ba0ec125f7c17d359df7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coloring.sty \
texlive-coloring"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
