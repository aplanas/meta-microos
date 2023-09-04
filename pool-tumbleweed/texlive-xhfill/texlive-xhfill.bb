SUMMARY = "Extending \\hrulefill"
DESCRIPTION = "The package provides extended macros for the default \\hrulefill \
command. It allows modification of the width and the colour of \
the line."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn22575"

RPM_NAME = "texlive-xhfill-2023.209.1.01svn22575-53.2.noarch.rpm"
RPM_HASH = "c99dcfd1f95d4a52e0b3e407b44987d5b5d1ce38ef47e36ece3fd49110dbc7769d8ee17316137f7981e067a7e855620c55d19b850e19f1a1cfc3cb5399b5ef89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xhfill.sty \
texlive-xhfill"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
