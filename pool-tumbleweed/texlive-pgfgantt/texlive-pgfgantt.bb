SUMMARY = "Draw Gantt charts with TikZ"
DESCRIPTION = "The package provides an environment for drawing Gantt charts \
that contain various elements (titles, bars, milestones, groups \
and links). Several keys customize the appearance of the chart \
elements."
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0svn52662"

RPM_NAME = "texlive-pgfgantt-2023.209.5.0svn52662-52.1.noarch.rpm"
RPM_HASH = "63eee893d8c49fd33e40ddeab2ef0fb38de7c1c2aec448b29ad139a5272ebf180289784b7afae64edf9acdf38c9100a8f6f686e093d5243546f2209b7d1ca420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfgantt.sty \
texlive-pgfgantt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfcalendar.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
