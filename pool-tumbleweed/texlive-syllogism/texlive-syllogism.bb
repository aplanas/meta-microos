SUMMARY = "Typeset syllogisms in LaTeX"
DESCRIPTION = "The package provides a simple, configurable, way for neatly \
typesetting syllogisms and syllogistic-like arguments, composed \
of two premises and a conclusion."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-syllogism-2023.209.1.2svn15878-58.1.noarch.rpm"
RPM_HASH = "a72ff69968cacb85f15ff08b75bee298c2653052d4ecbe2a6ee3262da9daca979ab76b6b150a577a9a155b6963421f095583fa842355574ae102f2baf478198d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syllogism.sty \
texlive-syllogism"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-calc.sty \
tex-ifthen.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
