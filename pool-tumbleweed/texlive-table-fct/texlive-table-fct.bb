SUMMARY = "Draw a variations table of functions and a convexity table of its graph"
DESCRIPTION = "Draw a variations table of functions and a convexity table of \
its graph This version offers two environnements, to draw \
variations table of a function and a convexity table of its \
graph."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn41849"

RPM_NAME = "texlive-table-fct-2023.201.1.1svn41849-57.1.noarch.rpm"
RPM_HASH = "2e9a17221b87cad257f37ab0c6556d27614cc3233f7aade125e81793dec9f0df5bcfd17227eba37ea445895568a0f9701a7e405191a18b18835ddfd23f91db39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-table-fct.sty \
texlive-table-fct"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-graphicx.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
