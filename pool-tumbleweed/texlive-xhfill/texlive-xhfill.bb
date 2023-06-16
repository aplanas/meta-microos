SUMMARY = "Extending \\hrulefill"
DESCRIPTION = "The package provides extended macros for the default \\hrulefill \
command. It allows modification of the width and the colour of \
the line."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn22575"

RPM_NAME = "texlive-xhfill-2023.201.1.01svn22575-52.1.noarch.rpm"
RPM_HASH = "564e9b277c2b86f006694aed196277603414c68748874502ebd7a80cf945aa350061e68954f05957b17c49f2817e43f5c1093923d81a64af17b89c6575775694"
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
