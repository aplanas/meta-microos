SUMMARY = "Construct Dynkin tree diagrams"
DESCRIPTION = "The package is intended for users needing to typeset a Dynkin \
Tree Diagram--a group theoretical construct consisting of \
cartan coefficients in boxes connected by a series of lines. \
Such a diagram is a tool for working out the states and their \
weights in terms of the fundamental weights and the simple \
roots. The package makes use of the author's coollist package."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-dyntree-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "c10ca5090d0624d370c0ef65e80f6aac902d16e5e31e3c5ce7c39c033065418b7d2c166a624de61f5d003f4d93e300f76ae8763e8a700d1f75716b4b8861d166"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dyntree.sty \
texlive-dyntree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-coollist.sty \
tex-eepic.sty \
tex-epic.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
