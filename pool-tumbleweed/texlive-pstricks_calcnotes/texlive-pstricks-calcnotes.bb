SUMMARY = "Use of PSTricks in calculus lecture notes"
DESCRIPTION = "The bundle shows the construction of PSTricks macros to draw \
Riemann sums of an integral and to draw the vector field of an \
ordinary differential equation. The results are illustrated in \
a fragment of lecture notes."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn34363"

RPM_NAME = "texlive-pstricks_calcnotes-2023.209.1.2svn34363-54.1.noarch.rpm"
RPM_HASH = "6cad4bf73d3dcef5b5cbe98a72021aa98dc38d75d75a34addfab32dbc8935d6e10f9be6c2706a7b6285f8ff50ba6f93976507032d151f67797b31392726ae367"
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
