SUMMARY = "MetaPost macros for 3D"
DESCRIPTION = "These macros allow the production of three-dimensional schemes \
containing: angles, circles, cylinders, cones and spheres, \
among other things."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.8.8svn35346"

RPM_NAME = "texlive-featpost-2023.209.0.0.8.8svn35346-53.1.noarch.rpm"
RPM_HASH = "ced271b1c6df02f019a1902ee53dc07b88165327930545fc2afff2418c2c2ca909cd3e711e693cff0ccaf19c0e513f6df594ef0868f382b0af40ff9c9f2597aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-featpost"

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
