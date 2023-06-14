SUMMARY = "Typeset syllogisms in LaTeX"
DESCRIPTION = "The package provides a simple, configurable, way for neatly \
typesetting syllogisms and syllogistic-like arguments, composed \
of two premises and a conclusion."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn15878"

RPM_NAME = "texlive-syllogism-2023.201.1.2svn15878-57.1.noarch.rpm"
RPM_HASH = "d06b5b18a8915ab3e6bddd92adeb57ab2617775bfd02355dc67688dcf5b043e26e2acede4ff47463b24e1b6f0b01b39bf0893bd5242d0245cc35d4109f95ef5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-syllogism.sty \
texlive-syllogism"

RDEPENDS:${PN} += "/bin/sh \
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
