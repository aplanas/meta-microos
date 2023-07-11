SUMMARY = "Use of PSTricks in calculus lecture notes"
DESCRIPTION = "The bundle shows the construction of PSTricks macros to draw \
Riemann sums of an integral and to draw the vector field of an \
ordinary differential equation. The results are illustrated in \
a fragment of lecture notes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn34363"

RPM_NAME = "texlive-pstricks_calcnotes-2023.201.1.2svn34363-53.2.noarch.rpm"
RPM_HASH = "b8206c9e1c52536e5fb6dec31ce06db49f1a891b695aac39a62bfdd4b5094f854dc291f52979b255da3643a9a098c883cd467c58979f5dc9da1b7ba6b4fca628"
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
