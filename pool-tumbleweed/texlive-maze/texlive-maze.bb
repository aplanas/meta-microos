SUMMARY = "Generate random mazes"
DESCRIPTION = "This package can generate random square mazes of a specified \
size. The mazes generated by this package are natural and their \
solution is not too obvious. The output it based on the picture \
environment."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn65508"

RPM_NAME = "texlive-maze-2023.208.1.2svn65508-53.1.noarch.rpm"
RPM_HASH = "088ba4fa3efd0d6d3ba25a362cb5598c8635b554ee68a438e440d510be91e696ddbeda630a2004aadc2aecd68034ab4067a922a00b1fcd7e3722c70f17cc0f09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maze.sty \
texlive-maze"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
