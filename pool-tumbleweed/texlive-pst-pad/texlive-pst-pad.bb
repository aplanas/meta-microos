SUMMARY = "Draw simple attachment systems with PSTricks"
DESCRIPTION = "The package collects a set of graphical elements based on \
PStricks that can be used to facilitate display of attachment \
systems such as two differently shaped surfaces with or without \
a fluid wedged in between. These macros ease the display of wet \
adhesion models and common friction systems such as boundary \
lubrication, elastohydrodynamic lubrication and hydrodynamic \
lubrication."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3bsvn15878"

RPM_NAME = "texlive-pst-pad-2023.209.0.0.3bsvn15878-53.1.noarch.rpm"
RPM_HASH = "1f851043824133970b1a0968ad636ac47352dc0fb4767cef6f6d647712ea9eeacb7a3cb5b5561d0e06d9bd0ecc9bfa0faefcddcfc472cc2d80029934924574a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-pad.sty \
tex-pst-pad.tex \
texlive-pst-pad"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
