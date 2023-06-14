SUMMARY = "Oscgons with PSTricks"
DESCRIPTION = "This PSTricks package enables you to produce oscilloscope \
'screen shots'. Three channels can be used to represent the \
most common signals (damped or not): namely sinusoidal, \
rectangular, triangular, dog's tooth (left and right oriented). \
The third channel allows you to add, to subtract or to multiply \
the two other signals. Lissajous diagrams (XY-mode) can also be \
obtained."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.82svn15878"

RPM_NAME = "texlive-pst-osci-2023.201.2.82svn15878-52.1.noarch.rpm"
RPM_HASH = "328415965d37c0a62966c934efadaa619c932a030f396c781b1779c1199605557ad7e90eed8b418a23916c6b3e667da9a0e3280a8e8ab664052b83e582af30dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-osci.sty \
tex-pst-osci.tex \
texlive-pst-osci"

RDEPENDS:${PN} += "/bin/sh \
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
