SUMMARY = "Containers for data in LaTeX"
DESCRIPTION = "The package allows the user to declare single object or array \
containers."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn30452"

RPM_NAME = "texlive-memory-2023.208.1.2svn30452-53.1.noarch.rpm"
RPM_HASH = "4e0bb57e3ca5ab08566298aa70b566a4b7578b92385ce1318f3f194a636590cd98a3d31d2982f69c5ef42d132cd99509084cab23d392feb1c0a2a5a5778305f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-memory.sty \
texlive-memory"

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
