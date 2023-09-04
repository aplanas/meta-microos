SUMMARY = "Draw keys and screen items of several Casio calculators"
DESCRIPTION = "This package defines commands to draw the Casio Graph 35 / \
fx-9750GII calculator (and other models). It can draw the whole \
calculator, or parts of it (individual keys, part of the \
screen, etc.). It was written to typeset documents instructing \
students how to use their calculator."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn65138"

RPM_NAME = "texlive-graph35-2023.209.0.0.1.3svn65138-54.2.noarch.rpm"
RPM_HASH = "679c2bca7a3425e0f790a1e1470fba6103affe424fbc64bbd7d83b83379125737d26ae4c1c352f068c4d0872081a7273075855b13002683bb3a01db539947ace"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-graph35-keys.sty \
tex-graph35-pixelart.sty \
tex-graph35.sty \
texlive-graph35"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-etoolbox.sty \
tex-letterspace.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-pixelart0.sty \
tex-sansmath.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
