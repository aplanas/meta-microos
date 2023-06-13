SUMMARY = "MetaPost macros for the reproduction of Garrigues' Easter nomogram"
DESCRIPTION = "MetaPost macros for the reproduction of Garrigues' Easter \
nomogram. These macros are described in Denis Roegel: An \
introduction to nomography: Garrigues' nomogram for the \
computation of Easter, TUGboat (volume 30, number 1, 2009, \
pages 88-104)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-garrigues-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "9604e8373dfed1351e6c06d5c12c01ed50ff8187ca91fe546e8b72111be85c2a40c05b4151fa651b7250135e6cd994d12a22b019475d97d32a21b54565c143f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garrigues"

RDEPENDS:${PN} += "/bin/sh \
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
