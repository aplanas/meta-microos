SUMMARY = "Defines the 16 colors from Ethan Schoonover's Solarized palette"
DESCRIPTION = "Built on top of the xcolor package, this package defines the \
sixteen colors of Ethan Schoonover's popular color palette, \
Solarized, for use in documents typeset with LaTeX and Friends."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn61719"

RPM_NAME = "texlive-xcolor-solarized-2023.201.0.0.4svn61719-52.2.noarch.rpm"
RPM_HASH = "35274150229a232a87c547b03b296e2ad07532dc51467e10e3bb139d0f85d206f09301506da3fff45329397575d261d028661fb587b7b75996c79ca2c3f8be58"
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
