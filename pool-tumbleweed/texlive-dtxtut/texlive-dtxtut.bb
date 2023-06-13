SUMMARY = "Tutorial on writing .dtx and .ins files"
DESCRIPTION = "This tutorial is intended for advanced LaTeX2e users who want \
to learn how to create .ins and .dtx files for distributing \
their homebrewed classes and package files."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn38375"

RPM_NAME = "texlive-dtxtut-2023.201.2.1svn38375-52.1.noarch.rpm"
RPM_HASH = "3c0c6b3a93c1c3abb325e49f3cedc466ffea6257fb717beb813682de9317036ea5e1a300e2d460b0fed30221fe3616ac0d450559802a9bd3ff5b53bfa1431db8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxtut"

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
