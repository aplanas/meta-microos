SUMMARY = "Defines the 16 colors from Ethan Schoonover's Solarized palette"
DESCRIPTION = "Built on top of the xcolor package, this package defines the \
sixteen colors of Ethan Schoonover's popular color palette, \
Solarized, for use in documents typeset with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-2023.209.0.0.4svn61719-53.2.noarch.rpm"
RPM_HASH = "3b43e93edfe5633845d0a8a456b6ff3cd6d464daaeb6810d3f25e8555badf35c0d5fb01ccf05131b2e4532344496cde10aa99f7c49535156d4099f8cecf1482e"
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
