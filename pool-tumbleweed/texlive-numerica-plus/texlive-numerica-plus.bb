SUMMARY = "Iteration and recurrence relations: finding fixed points, zeros and extrema of functions"
DESCRIPTION = "The package defines commands to iterate functions of a single \
variable, find fixed points, zeros and extrema of such \
functions, and calculate the terms of recurrence relations. \
numerica-plus requires the package numerica, version 2, which \
in turn requires l3kernel , l3packages, and the amsmath and \
mathtools packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn61289"

RPM_NAME = "texlive-numerica-plus-2023.209.2.0.0svn61289-55.1.noarch.rpm"
RPM_HASH = "52bc9f53af969b242697f0df9e1a6b15d72796d35c80beb91937c9f991565539112a42342d379f868a5b08bbce9c6eed01c705284b0cf882e82f63d2ae2b513f"
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
