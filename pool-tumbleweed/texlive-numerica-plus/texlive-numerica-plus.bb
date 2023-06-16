SUMMARY = "Iteration and recurrence relations: finding fixed points, zeros and extrema of functions"
DESCRIPTION = "The package defines commands to iterate functions of a single \
variable, find fixed points, zeros and extrema of such \
functions, and calculate the terms of recurrence relations. \
numerica-plus requires the package numerica, version 2, which \
in turn requires l3kernel , l3packages, and the amsmath and \
mathtools packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn61289"

RPM_NAME = "texlive-numerica-plus-2023.201.2.0.0svn61289-54.1.noarch.rpm"
RPM_HASH = "21eaa1e98b6ae1c3d3ac87ef4c3a8962665989470444433be3a972263e3e4b3cc36109d01cbf16b9b50b5e64080c472762082330ca8f4190e2fea1832ab97bb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numerica-plus.sty \
texlive-numerica-plus"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numerica.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
