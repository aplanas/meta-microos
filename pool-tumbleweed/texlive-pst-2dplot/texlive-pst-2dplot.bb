SUMMARY = "A PSTricks package for drawing 2D curves"
DESCRIPTION = "Pst-2dplot is a pstricks package that offers an easy-to-use and \
intuitive tool for plotting 2-d curves. It defines an \
environment with commands similar to MATLAB for plotting."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn15878"

RPM_NAME = "texlive-pst-2dplot-2023.209.1.5svn15878-53.1.noarch.rpm"
RPM_HASH = "04edaf6296de852ee32f533e590e7e5c20a8e9acfa35291cc34ef3d7a578029a143cb657fbac85f144c5ed2f65770c53dd8149684fbcfe5048a00109ce5d6764"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-2dplot.sty \
texlive-pst-2dplot"

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
