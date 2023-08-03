SUMMARY = "Draw a variations table of functions and a convexity table of its graph"
DESCRIPTION = "Draw a variations table of functions and a convexity table of \
its graph This version offers two environnements, to draw \
variations table of a function and a convexity table of its \
graph."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn41849"

RPM_NAME = "texlive-table-fct-2023.209.1.1svn41849-58.1.noarch.rpm"
RPM_HASH = "e1689a5d1e8d9daaa1950d6c316dfde870ec5bafe6d4aa23eedf4bc98de1131fd74ec24dc8d118d8a10cbf2beb30b033a57f5cd637773c83132297bb6d2bdc9a"
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
