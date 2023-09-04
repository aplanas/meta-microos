SUMMARY = "Use of PSTricks in calculus lecture notes"
DESCRIPTION = "The bundle shows the construction of PSTricks macros to draw \
Riemann sums of an integral and to draw the vector field of an \
ordinary differential equation. The results are illustrated in \
a fragment of lecture notes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn34363"

RPM_NAME = "texlive-pstricks_calcnotes-2023.209.1.2svn34363-54.2.noarch.rpm"
RPM_HASH = "608d54d3255b0a22ba147c1c12394ddf52d87f83bbf7a5b13fecadf41d1c48d788a0d78f006df2dd19d3e04ed75c7c1622ff28b457b17c213754fcfaef0c3dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks-calcnotes"

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
