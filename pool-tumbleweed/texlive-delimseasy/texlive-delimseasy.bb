SUMMARY = "Delimiter commands that are easy to use and resize"
DESCRIPTION = "This package provides commands to give a consistent, \
easy-to-remember, easy to edit way to control the size and \
blackness of delimiters: append 1-4 'b's to command for larger \
sizes; prepend 'B' for for boldface. These commands reduce the \
likelihood of incomplete delimeter pairs and typically use \
fewer characters than the LaTeX default."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn39589"

RPM_NAME = "texlive-delimseasy-2023.209.2.0svn39589-53.1.noarch.rpm"
RPM_HASH = "d897110361e8ba4bc59a48ab8e1751390a8d933eff3b76c7d14eee95dcccab2b885047c68e87f0b3afa65321c4c4205b31db56b35a9125db1c52e7203cf26c0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delimseasy.sty \
texlive-delimseasy"

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
