SUMMARY = "Define missing colors by their names"
DESCRIPTION = "This package makes it possible to define colors automatically \
by their names. This can be useful in drawing TikZ pictures and \
designing beamer themes. Using the package, you don't need to \
write \\definecolor before using a color."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn41042"

RPM_NAME = "texlive-coloring-2023.209.0.0.2svn41042-54.1.noarch.rpm"
RPM_HASH = "223475718b47298ee0325a5d24ccd915a19308264c6680d5f8b70f7cce38438082b62032fa9f4618a0cd784e87c384b8ea1a6779aa1eabf9bc70cfecdfd79993"
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
