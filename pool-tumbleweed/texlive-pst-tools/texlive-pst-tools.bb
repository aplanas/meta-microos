SUMMARY = "PSTricks support functions"
DESCRIPTION = "The package provides helper functions for other PSTricks \
related packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-2023.209.0.0.12svn60621-54.1.noarch.rpm"
RPM_HASH = "7eba823364c171abec392b7310e29f740c5d5087fcfdef0c9405b3919120340968e1b7d8cbc976aef872cbedc4579f648ce4b01c810362dc909ff64af11ecc2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-tools.sty \
tex-pst-tools.tex \
texlive-pst-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
