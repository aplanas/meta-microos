SUMMARY = "Command for typesetting chemical formulas and reactions"
DESCRIPTION = "The package provides a command to typeset chemical formulas and \
reactions in support of other chemistry packages (such as \
chemmacros). The package used to be distributed as a part of \
chemmacros."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.17svn61719"

RPM_NAME = "texlive-chemformula-2023.201.4.17svn61719-53.1.noarch.rpm"
RPM_HASH = "ead33a7087e9a1730bdada6856713842fabeecfe77cc69ef1bb92cd2f3f12cc178c233f3104894f549adc23c5bac8d16407f3d4a5c1e17c47334ed280c26897a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemformula.sty \
texlive-chemformula"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-nicefrac.sty \
tex-tikz.sty \
tex-xfrac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-units"

inherit rpm
