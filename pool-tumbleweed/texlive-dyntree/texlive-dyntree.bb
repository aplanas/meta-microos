SUMMARY = "Construct Dynkin tree diagrams"
DESCRIPTION = "The package is intended for users needing to typeset a Dynkin \
Tree Diagram--a group theoretical construct consisting of \
cartan coefficients in boxes connected by a series of lines. \
Such a diagram is a tool for working out the states and their \
weights in terms of the fundamental weights and the simple \
roots. The package makes use of the author's coollist package."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-dyntree-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "073751c0b60e1a6a59c6ff3f83cfd0d7f9a4b56de1d46144dbcdbc3b8f901efed110b48e5e0edc2eb4f02623e9f0da5b2b9789b4ea22a6c66bc83789a74d466f"
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
