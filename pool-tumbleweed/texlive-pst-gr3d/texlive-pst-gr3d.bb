SUMMARY = "Three dimensional grids with PSTricks"
DESCRIPTION = "This PSTricks package provides a command \\PstGridThreeD that \
will draw a three dimensional grid, offering a number of \
options for its appearance."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.34svn15878"

RPM_NAME = "texlive-pst-gr3d-2023.209.1.34svn15878-53.1.noarch.rpm"
RPM_HASH = "b41e4c2401ecf41fcad6ca7b8301c6e46fe5f4f47601dcc5eec6fa9dc9dd193afb5c89d47b5aa2b95aa4c94e9c5e910dfe4ce66109f952aaa2568f04c641e5ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-gr3d.sty \
tex-pst-gr3d.tex \
texlive-pst-gr3d"

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
