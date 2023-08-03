SUMMARY = "Oscgons with PSTricks"
DESCRIPTION = "This PSTricks package enables you to produce oscilloscope \
'screen shots'. Three channels can be used to represent the \
most common signals (damped or not): namely sinusoidal, \
rectangular, triangular, dog's tooth (left and right oriented). \
The third channel allows you to add, to subtract or to multiply \
the two other signals. Lissajous diagrams (XY-mode) can also be \
obtained."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.82svn15878"

RPM_NAME = "texlive-pst-osci-2023.209.2.82svn15878-53.1.noarch.rpm"
RPM_HASH = "307e5dac81d5003c6afdc2de13bbee8556700d823e21ad45a9630274d881914b0aee5f012e9c17e3c07b4d464ee51894aa1f2553b187d1200f681f0df9d5b344"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-osci.sty \
tex-pst-osci.tex \
texlive-pst-osci"

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
