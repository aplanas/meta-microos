SUMMARY = "Draw geometrical constructions"
DESCRIPTION = "This package provides tools to draw most of the geometrical \
constructions that a high school instructor or bachelor degree \
professor might need to teach geometry. The connection to \
Euclide depends on the fact that in his times calculations were \
made with ruler, compass and also with ellipsograph. This \
package extends the functionalities of the curve2e package."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.1svn60697"

RPM_NAME = "texlive-euclideangeometry-2023.209.0.0.2.1svn60697-53.1.noarch.rpm"
RPM_HASH = "215f6066270532133ac99079ad4b55327646d7f231ffcd553c47b53c368e88dec33740a5deb55875a4e19ebf35ebb56ca5fe1e4eb77dfa996d3ff54b655e72f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euclideangeometry.sty \
texlive-euclideangeometry"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-curve2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
