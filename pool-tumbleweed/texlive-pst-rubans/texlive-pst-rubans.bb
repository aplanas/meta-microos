SUMMARY = "Draw three-dimensional ribbons"
DESCRIPTION = "The package uses PStricks and pst-solides3d to draw three \
dimensional ribbons on a cylinder, torus, sphere, cone or \
paraboloid. The width of the ribbon, the number of turns, the \
colour of the outer and the inner surface of the ribbon may be \
set. In the case of circular and conical helices, one may also \
choose the number of ribbons."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-2023.201.1.2svn23464-53.2.noarch.rpm"
RPM_HASH = "578badaa0e52c112bf5328d5269440cacf7961f7115e8af74addfe2f3a05d49c5afd3b08b3d3e9a83a3de7811c5f73a0da5e38fbf873ee4f2fd413baeb6643a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-rubans.sty \
tex-pst-rubans.tex \
texlive-pst-rubans"

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
