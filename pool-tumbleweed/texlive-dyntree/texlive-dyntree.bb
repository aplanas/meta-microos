SUMMARY = "Construct Dynkin tree diagrams"
DESCRIPTION = "The package is intended for users needing to typeset a Dynkin \
Tree Diagram--a group theoretical construct consisting of \
cartan coefficients in boxes connected by a series of lines. \
Such a diagram is a tool for working out the states and their \
weights in terms of the fundamental weights and the simple \
roots. The package makes use of the author's coollist package."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-dyntree-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "7acc09e4f78e6ae80f2a333bad282152e410d8e6b2c1b077828b185b2ed71f817875e301e692f59696dbcfcfd776efd87df65c680d5551f372ad254396bb7fef"
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
