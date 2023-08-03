SUMMARY = "A (Not So) Short Introduction to LaTeX2e"
DESCRIPTION = "The document derives from a German introduction ('lkurz'), \
which was translated and updated; it continues to be updated. \
This translation has, in its turn, been translated into several \
other languages; see the lshort catalogue entry for the current \
list."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.6.4svn58309"

RPM_NAME = "texlive-lshort-english-2023.209.6.4svn58309-55.1.noarch.rpm"
RPM_HASH = "df1419d8b536fc38376b0184a1eaf78e746fcc7c67062b27a20938b0d3de999faadc13a607fff8caa86a5837a6d6b5d3d87c1129c1b2468075e904aabe7b9783"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-english"

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
