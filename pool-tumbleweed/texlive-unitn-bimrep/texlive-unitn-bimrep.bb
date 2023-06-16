SUMMARY = "A bimonthly report class for the PhD School of Materials, Mechatronics and System Engineering"
DESCRIPTION = "This package allows to rapidly write the bimonthly report for \
The Ph.D. School in Materials, Mechatronics and System \
Engineering. It allows to define the research activities, the \
participation to school and congress, and the publication \
performed by a student."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45581"

RPM_NAME = "texlive-unitn-bimrep-2023.201.svn45581-53.1.noarch.rpm"
RPM_HASH = "b092ac47d346c4787b0058f93604adacf2d600358236d3395bde527318800354893c303c2eb0b23125db7224d349585eedf58a865f25c8ec0d8a0b5542504df9"
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
