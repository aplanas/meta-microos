SUMMARY = "Use of PSTricks in calculus lecture notes"
DESCRIPTION = "The bundle shows the construction of PSTricks macros to draw \
Riemann sums of an integral and to draw the vector field of an \
ordinary differential equation. The results are illustrated in \
a fragment of lecture notes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn34363"

RPM_NAME = "texlive-pstricks_calcnotes-2023.201.1.2svn34363-53.1.noarch.rpm"
RPM_HASH = "032d99a75e45f2eecaaa181135ecb27fe327894ad2122a576b4d8950c4af5aec452ee0a95f439ed95a72431f5a4374d37592c20be57878b03ce80cb06c731141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstricks_calcnotes"

RDEPENDS:${PN} += "/bin/sh \
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
