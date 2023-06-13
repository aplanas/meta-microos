SUMMARY = "Three dimensional grids with PSTricks"
DESCRIPTION = "This PSTricks package provides a command \\PstGridThreeD that \
will draw a three dimensional grid, offering a number of \
options for its appearance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.34svn15878"

RPM_NAME = "texlive-pst-gr3d-2023.201.1.34svn15878-52.1.noarch.rpm"
RPM_HASH = "105cbf27fb27a468cc718de28ec4ed40d09cec9cc9d2633e5e15e7bdd65af3121e61492cd8e105c837bc632cb9dd24227e408edc2968f07ba8524af770c78978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-gr3d.sty) \
tex(pst-gr3d.tex) \
texlive-pst-gr3d"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
