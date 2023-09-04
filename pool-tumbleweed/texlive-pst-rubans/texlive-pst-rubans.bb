SUMMARY = "Draw three-dimensional ribbons"
DESCRIPTION = "The package uses PStricks and pst-solides3d to draw three \
dimensional ribbons on a cylinder, torus, sphere, cone or \
paraboloid. The width of the ribbon, the number of turns, the \
colour of the outer and the inner surface of the ribbon may be \
set. In the case of circular and conical helices, one may also \
choose the number of ribbons."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn23464"

RPM_NAME = "texlive-pst-rubans-2023.209.1.2svn23464-54.2.noarch.rpm"
RPM_HASH = "98f3631951dabf0ae81fa2b58eb16699b37b24f1a1352f6a8cc85c6afa5a6f87a9ab3504b6006c435b218a62aac75844d152c8ea7f348c305d94e44c1cb9dcc7"
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
