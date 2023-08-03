SUMMARY = "Draw keys and screen items of several Casio calculators"
DESCRIPTION = "This package defines commands to draw the Casio Graph 35 / \
fx-9750GII calculator (and other models). It can draw the whole \
calculator, or parts of it (individual keys, part of the \
screen, etc.). It was written to typeset documents instructing \
students how to use their calculator."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.3svn65138"

RPM_NAME = "texlive-graph35-2023.209.0.0.1.3svn65138-54.1.noarch.rpm"
RPM_HASH = "d7a461b336a9179b66f56a171de6d1f3fc66c3a4834641f89244beae5ac38dee33dd48a2ef670edbcbf0b80e2ea6d95f8f4817915eeef02a17ee7f9c2b6bde4b"
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
