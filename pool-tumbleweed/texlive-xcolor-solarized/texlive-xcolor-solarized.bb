SUMMARY = "Defines the 16 colors from Ethan Schoonover's Solarized palette"
DESCRIPTION = "Built on top of the xcolor package, this package defines the \
sixteen colors of Ethan Schoonover's popular color palette, \
Solarized, for use in documents typeset with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-2023.209.0.0.4svn61719-53.1.noarch.rpm"
RPM_HASH = "a5dd67fa49d42968f757b10304db2c44230990a02379ea76d8abe40660816c3e96ff23dc30246596966bcc93969ef4dfbdc26807c7c831e2dd85286c0c4391df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xcolor-solarized.sty \
texlive-xcolor-solarized"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
