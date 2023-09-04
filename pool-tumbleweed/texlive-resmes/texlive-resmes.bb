SUMMARY = "Measure restriction symbol in LaTeX"
DESCRIPTION = "This package provides a simple macro \\resmes that prints the \
measure restriction symbol."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn65375"

RPM_NAME = "texlive-resmes-2023.209.1.0svn65375-54.2.noarch.rpm"
RPM_HASH = "0fec57931b14665e3f4d13bc3abc5145b6edb2d362340ce48dfdf74b9edb9c84702ecd491b6b13a2b227a63ab557e80d4077b056e2f6466e93c443da41ecb794"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resmes.sty \
texlive-resmes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
