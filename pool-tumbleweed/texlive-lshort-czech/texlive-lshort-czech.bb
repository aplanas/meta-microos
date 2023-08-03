SUMMARY = "Czech translation of the 'Short Introduction to LaTeX2e'"
DESCRIPTION = "This is the Czech translation of 'A Short Introduction to \
LaTeX2e'."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.4.27svn55643"

RPM_NAME = "texlive-lshort-czech-2023.209.4.27svn55643-55.1.noarch.rpm"
RPM_HASH = "7f77e7dfd5e1162c0e3d84358992bba497ce65069b72127db2332f196e75eaf50e42b284b447a0b6dbf83e3d3e912b00a4ae24feaf05308f0a4b775fdd6e959d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lshort-czech"

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
