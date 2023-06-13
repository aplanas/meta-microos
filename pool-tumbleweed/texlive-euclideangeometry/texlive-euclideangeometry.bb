SUMMARY = "Draw geometrical constructions"
DESCRIPTION = "This package provides tools to draw most of the geometrical \
constructions that a high school instructor or bachelor degree \
professor might need to teach geometry. The connection to \
Euclide depends on the fact that in his times calculations were \
made with ruler, compass and also with ellipsograph. This \
package extends the functionalities of the curve2e package."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn60697"

RPM_NAME = "texlive-euclideangeometry-2023.201.0.0.2.1svn60697-52.1.noarch.rpm"
RPM_HASH = "bf082ddac6d8f4dbc500b747fd9ea4590a7c4e3d9a130cf964cdd8e9c05c7f37dd86951d6be89089ce2b99d9cea763b283e55c6a8d6cb005be8d31953fd95bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(euclideangeometry.sty) \
texlive-euclideangeometry"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(curve2e.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
