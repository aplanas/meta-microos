SUMMARY = "A bimonthly report class for the PhD School of Materials, Mechatronics and System Engineering"
DESCRIPTION = "This package allows to rapidly write the bimonthly report for \
The Ph.D. School in Materials, Mechatronics and System \
Engineering. It allows to define the research activities, the \
participation to school and congress, and the publication \
performed by a student."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45581"

RPM_NAME = "texlive-unitn-bimrep-2023.209.svn45581-54.1.noarch.rpm"
RPM_HASH = "65511c3313e55cc2d3b11b09e87dca2febba945636f0854790724d273754e16feb10ff92963fddc19da9a9a37a0dc2a401c83b1065fdc5b38919ce71036ec8b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unitn-bimrep.cls \
texlive-unitn-bimrep"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-fontenc.sty \
tex-framed.sty \
tex-graphicx.sty \
tex-libertine.sty \
tex-report.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
