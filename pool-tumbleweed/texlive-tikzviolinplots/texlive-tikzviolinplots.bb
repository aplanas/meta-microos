SUMMARY = "Draws violin plots from data"
DESCRIPTION = "This package enables the user to draw violin plots, calculating \
the kernel density estimation from the data and plotting the \
resulting curve inside a tikzpicture environment. It supports \
different kernels, and allows the user to either set the \
bandwidth value for each plot or use a default value."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.1svn65687"

RPM_NAME = "texlive-tikzviolinplots-2023.201.0.0.7.1svn65687-52.1.noarch.rpm"
RPM_HASH = "f10ec15f5d07398cade5f1b0073128ba944378964ed7ebcc58bc1e30e154dc3ce12d907d9fc08c36582563697affd73a066e9d2682760fb86460c50ca99abe5d"
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
