SUMMARY = "Draw three-dimensional ribbons"
DESCRIPTION = "The package uses PStricks and pst-solides3d to draw three \
dimensional ribbons on a cylinder, torus, sphere, cone or \
paraboloid. The width of the ribbon, the number of turns, the \
colour of the outer and the inner surface of the ribbon may be \
set. In the case of circular and conical helices, one may also \
choose the number of ribbons."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-2023.209.1.2svn23464-54.1.noarch.rpm"
RPM_HASH = "4dcb004cba4ca1b2b3bbb719be6b7c906bd5edc48f5e94e44ac01e0777e9f28ee83a97d273f90b12ac6273a5e14d021842ec5067a5a2292a6c57ef78edfd6229"
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
