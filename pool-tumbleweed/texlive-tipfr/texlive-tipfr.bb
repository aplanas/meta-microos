SUMMARY = "Produces calculator's keys with the help of TikZ"
DESCRIPTION = "The package provides commands to draw calculator keys with the \
help of TikZ. It also provides commands to draw the content of \
screens and of menu items."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn38646"

RPM_NAME = "texlive-tipfr-2023.209.1.5svn38646-53.1.noarch.rpm"
RPM_HASH = "ba527e7d8ae7b9c7e2c68e7c735de61429bf2e43d569469a6ea8c6c469b1111264f0537b1a2a0f9f7d75a99f466944478fb15ef14c91113063368d3154b5d102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tipfr.sty \
texlive-tipfr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-multido.sty \
tex-newtxtt.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
