SUMMARY = "Draw simple attachment systems with PSTricks"
DESCRIPTION = "The package collects a set of graphical elements based on \
PStricks that can be used to facilitate display of attachment \
systems such as two differently shaped surfaces with or without \
a fluid wedged in between. These macros ease the display of wet \
adhesion models and common friction systems such as boundary \
lubrication, elastohydrodynamic lubrication and hydrodynamic \
lubrication."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3bsvn15878"

RPM_NAME = "texlive-pst-pad-2023.201.0.0.3bsvn15878-52.1.noarch.rpm"
RPM_HASH = "755ca1ada1815b6aaaf04649e43b560d1e4a62479bc573076b31a6b67f3ac90bc85684727dd4f62530b3c5869f36304f4bc6be73db51521a85ae44521f7ce67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-pad.sty) \
tex(pst-pad.tex) \
texlive-pst-pad"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
