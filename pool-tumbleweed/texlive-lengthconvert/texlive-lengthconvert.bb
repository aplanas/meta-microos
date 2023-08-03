SUMMARY = "Express lengths in arbitrary units"
DESCRIPTION = "The package provides a command to convert a length to any of a \
large selection of units. The package relies on the LaTeX3 \
programming environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn55064"

RPM_NAME = "texlive-lengthconvert-2023.209.1.0asvn55064-55.1.noarch.rpm"
RPM_HASH = "2a685d2d7587dd8c1b796ad1eda9d3704a1fefe6a55ac25657b6557692c79025b8b9f250e2d3f0ab051027ce9abff5e65d5b3f53e03ef31e96ac3cd8d5777989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lengthconvert.sty \
texlive-lengthconvert"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
