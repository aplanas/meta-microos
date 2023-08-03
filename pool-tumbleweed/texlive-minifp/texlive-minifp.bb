SUMMARY = "Fixed-point real computations to 8 decimals"
DESCRIPTION = "The package provides basic arithmetic operations to 8 decimal \
places for plain TeX or LaTeX. Results are exact when they fit \
within the digit limits. Along with the basic package is an \
optional extension that adds computation of sin, cos, log, \
sqrt, exp, powers and angles. These are also exact when \
theoretically possible and are otherwise accurate to at least 7 \
decimal places. In addition, the package provides a stack-based \
programing environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.96svn32559"

RPM_NAME = "texlive-minifp-2023.209.0.0.96svn32559-55.1.noarch.rpm"
RPM_HASH = "e615ec6bddedd9429c3330120764ff93d47c7b40fef7e2ece2f0e928c26579c0a763a6ea19c9d5fd0a1e7b97a0d130c3b7f42409219c2cd344004aef8575aaf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mfpextra.tex \
tex-minifp.sty \
texlive-minifp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
