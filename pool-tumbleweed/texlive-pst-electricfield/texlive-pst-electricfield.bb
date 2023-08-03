SUMMARY = "Draw electric field and equipotential lines with PSTricks"
DESCRIPTION = "The package provides macros to plot electric field and \
equipotential lines using PStricks. There may be any number of \
charges which can be placed in a cartesian coordinate system by \
(x,y) values."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.14svn29803"

RPM_NAME = "texlive-pst-electricfield-2023.209.0.0.14svn29803-53.1.noarch.rpm"
RPM_HASH = "167d13b711bb331c476c78cecab5bc5725bb5f80550893ccaf6d7973df6b700296cd7a9bdbf7aa71602b83867fb24879ca79e3c52b246baa97e1440ab8689962"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-electricfield.sty \
tex-pst-electricfield.tex \
texlive-pst-electricfield"

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
