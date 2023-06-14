SUMMARY = "Quick float definitions in LaTeX"
DESCRIPTION = "The trivfloat package provides a quick method for defining new \
float types in LaTeX. A single command sets up a new float in \
the same style as the LaTeX kernel figure and table float \
types. The package works with memoir as well as the standard \
classes."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3bsvn15878"

RPM_NAME = "texlive-trivfloat-2023.201.1.3bsvn15878-52.1.noarch.rpm"
RPM_HASH = "20f48f23939c15d5b341e1ae9cafc51823c932b9abfae50536f5111f822b7eb8ab4839efa76bcd54d71056eff12563e65622dfa752378e67b551395e7049363c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-trivfloat.sty \
texlive-trivfloat"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-floatrow.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
