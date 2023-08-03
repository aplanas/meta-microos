SUMMARY = "Automatically typeset the academic year (French way)"
DESCRIPTION = "This package provides a macro \\anneescolaire to automatically \
write the academic year in the French way, according to the \
date of compilation, two other macros to obtain the first and \
the second calendar year of the academic year, a macro to be \
redefined to change the presentation of the years."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn55988"

RPM_NAME = "texlive-annee-scolaire-2023.209.1.6svn55988-55.1.noarch.rpm"
RPM_HASH = "39a1948ea259ff17b18f2a6ce23cb5a0c9ec8ad6e67a29b8faf4c91ae4f8ecdd6e0c8de2255964b798401e73a467fd374556471435be8ad1e8fdb53b8cb8ab2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-annee-scolaire.sty \
texlive-annee-scolaire"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
