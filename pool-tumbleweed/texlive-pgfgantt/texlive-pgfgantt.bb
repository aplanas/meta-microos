SUMMARY = "Draw Gantt charts with TikZ"
DESCRIPTION = "The package provides an environment for drawing Gantt charts \
that contain various elements (titles, bars, milestones, groups \
and links). Several keys customize the appearance of the chart \
elements."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.0svn52662"

RPM_NAME = "texlive-pgfgantt-2023.201.5.0svn52662-51.1.noarch.rpm"
RPM_HASH = "e033cd1b42aa18888fd7f3bb7204fb5957841ca77e6ab275975b69aed7afbf92771886f5f5cf0bba3cd780787317f1437a93d3120510fd4e2e4ab79efad87bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgfgantt.sty) \
texlive-pgfgantt"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgfcalendar.sty) \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
