SUMMARY = "A MetaPost library for physics textbook illustrations"
DESCRIPTION = "This MetaPost library was initially written to automate some \
elements of black and white illustrations for a physics \
textbook. It provides functions to draw things like lines of \
variable width, shaded spheres, and tubes of different kinds, \
which can be used to produce images of a variety of objects. \
The library also contains functions to draw some objects \
constructed from these primitives."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2.0svn61944"

RPM_NAME = "texlive-fiziko-2023.209.0.0.2.0svn61944-53.1.noarch.rpm"
RPM_HASH = "aabd13f195a20139077c6daef9dcbd16d352740551e3a1ebe45e5ef0431e1235e7fbffbd6fcb4f84f2ecc2439e53e02eaa0dfdbd0a25d830adf53b5d23eb7835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fiziko"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
