SUMMARY = "Collect contents of a tabular cell as argument to a macro"
DESCRIPTION = "The package provides macros that collect the content of a \
tabular cell, and offer them as an argument to a macro. Special \
care is taken to remove all aligning macros inserted by tabular \
from the cell content. The macros also work in the last column \
of a table, but do not support verbatim material inside the \
cells."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn64967"

RPM_NAME = "texlive-collcell-2023.209.0.0.5svn64967-54.1.noarch.rpm"
RPM_HASH = "6ec5d4bb734a819c717e75bdcd194f40c9fcd29917642a6385c8e1176b7007781edd38778ae226bf8ac96a71898ebb0b6857fce8fcd1e6f47bd3148c368c5238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collcell.sty \
texlive-collcell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-etoolbox.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
