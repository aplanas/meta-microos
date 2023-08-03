SUMMARY = "MetaPost macros for the reproduction of Garrigues' Easter nomogram"
DESCRIPTION = "MetaPost macros for the reproduction of Garrigues' Easter \
nomogram. These macros are described in Denis Roegel: An \
introduction to nomography: Garrigues' nomogram for the \
computation of Easter, TUGboat (volume 30, number 1, 2009, \
pages 88-104)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-garrigues-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "26f522efd0c1022414ddc94ffbacd68349e925f2c7dfc90bdee55a69ea42b0f5c8609a441b3888777d228a4542037673873fdf7b5cc231d1203ce72647a9e0b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garrigues"

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
