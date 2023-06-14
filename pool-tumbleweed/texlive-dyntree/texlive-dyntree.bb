SUMMARY = "Construct Dynkin tree diagrams"
DESCRIPTION = "The package is intended for users needing to typeset a Dynkin \
Tree Diagram--a group theoretical construct consisting of \
cartan coefficients in boxes connected by a series of lines. \
Such a diagram is a tool for working out the states and their \
weights in terms of the fundamental weights and the simple \
roots. The package makes use of the author's coollist package."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-dyntree-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "f80c8a0d4e646d0ab279ed1a89a715e1c6b0af597eea1e0fd83c929d96dc99bd01471f1f825d91e59da98004607565e88cfc53f3ea2ef88bea40b5ad824fcd13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dyntree.sty \
texlive-dyntree"

RDEPENDS:${PN} += "/bin/sh \
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
