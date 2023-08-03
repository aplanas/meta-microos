SUMMARY = "Simple consecutive numbering of chemical compounds"
DESCRIPTION = "The chemcompounds package allows for a simple consecutive \
numbering of chemical compounds. Optionally, it is possible to \
supply a custom name for each compound. The package differs \
from the chemcono package by not generating an odd-looking list \
of compounds inside the text."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-chemcompounds-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e9afe2d9d9605118985232e1ef0b7f22ea0e48b3b23401a2195b018d2edd7e8ebb26c503a920fd67115328d6afc073883738f39c071dfce6ffcdddb8a8cc02e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemcompounds.sty \
texlive-chemcompounds"

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
