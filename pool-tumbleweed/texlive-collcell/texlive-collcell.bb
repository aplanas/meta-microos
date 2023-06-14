SUMMARY = "Collect contents of a tabular cell as argument to a macro"
DESCRIPTION = "The package provides macros that collect the content of a \
tabular cell, and offer them as an argument to a macro. Special \
care is taken to remove all aligning macros inserted by tabular \
from the cell content. The macros also work in the last column \
of a table, but do not support verbatim material inside the \
cells."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn64967"

RPM_NAME = "texlive-collcell-2023.201.0.0.5svn64967-53.1.noarch.rpm"
RPM_HASH = "8eb1820e0fa3e5b80fd3e5e81b3ecdd5985a5cd95795755e79fe733eb49b536d89ccdff3b8d3f025656b07f1895c3ace3b3f629388a6177bc5fa1446225eba94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-collcell.sty \
texlive-collcell"

RDEPENDS:${PN} += "/bin/sh \
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
