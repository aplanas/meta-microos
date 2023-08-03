SUMMARY = "A package for Gaussian operations"
DESCRIPTION = "The gauss package provides configurable tools for producing row \
and column operations on matrices (a.k.a. Gaussian operations)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32934"

RPM_NAME = "texlive-gauss-2023.209.svn32934-53.1.noarch.rpm"
RPM_HASH = "60931af8b3db95520cad5122af233eadce5197caa7bd0b8814aa8192d81a841da4d6434ae90e464e2ce7ef75cb7d3f38e2907a14305a138fff3e91988725c269"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gauss.sty \
texlive-gauss"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
