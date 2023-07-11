SUMMARY = "The 'real' way to transpose a Matrix"
DESCRIPTION = "With realtranspose you can notate the transposition of a matrix \
by rotating the symbols 90 degrees. This is a hommage to the \
realhats package."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56623"

RPM_NAME = "texlive-realtranspose-2023.201.1.1svn56623-53.2.noarch.rpm"
RPM_HASH = "427b6bee2adcdd1409ec68d072597661aa361b080c5c2099b5a6c9698e8f15bc9c31cbf2e5a271246a544de429791c2e7d33cc0cd691ca8ffa64273ec85ac901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realtranspose.sty \
texlive-realtranspose"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
