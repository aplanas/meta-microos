SUMMARY = "Draws violin plots from data"
DESCRIPTION = "This package enables the user to draw violin plots, calculating \
the kernel density estimation from the data and plotting the \
resulting curve inside a tikzpicture environment. It supports \
different kernels, and allows the user to either set the \
bandwidth value for each plot or use a default value."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.1svn65687"

RPM_NAME = "texlive-tikzviolinplots-2023.209.0.0.7.1svn65687-53.1.noarch.rpm"
RPM_HASH = "74c2c8e4cdea03704da4e3e98d11690d3b54ca3c3da837e8ddf6b9279b2736d57b3f873737001371986a8636ad63bfa19670e6939616739c6e886d1c62320b07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzviolinplots.sty \
texlive-tikzviolinplots"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgfkeys.sty \
tex-pgfplots.sty \
tex-pgfplotstable.sty \
tex-stringstrings.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
