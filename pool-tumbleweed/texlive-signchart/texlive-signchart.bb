SUMMARY = "Create beautifully typeset sign charts"
DESCRIPTION = "The package allows users to easily typeset beautiful looking \
sign charts directly into their (La)TeX document."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn39707"

RPM_NAME = "texlive-signchart-2023.209.1.01svn39707-54.1.noarch.rpm"
RPM_HASH = "ba9897c1963d7e81e74b5b7dfe4549b3de18247295f2cd6ac957f7c089ec06ff0366cc4e3f9dd56303c0f0d2670620804dc236dc2c03711fe9b8902c24dcc20e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-signchart.sty \
texlive-signchart"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfplots.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
