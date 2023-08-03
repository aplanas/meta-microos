SUMMARY = "Command for typesetting chemical formulas and reactions"
DESCRIPTION = "The package provides a command to typeset chemical formulas and \
reactions in support of other chemistry packages (such as \
chemmacros). The package used to be distributed as a part of \
chemmacros."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.17svn61719"

RPM_NAME = "texlive-chemformula-2023.209.4.17svn61719-54.1.noarch.rpm"
RPM_HASH = "fc95910e65caa7373a1d60c4b51d3749b54bfeaffddba00b6c11e51b2b3cab9a77c3f70fadec12b1abfffbcfe3b0d6e7bbb315fde46f9cd6d26afeef54a87404"
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
