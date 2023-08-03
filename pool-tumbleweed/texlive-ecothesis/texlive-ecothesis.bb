SUMMARY = "LaTeX thesis template for the Universidade Federal de Vicosa (UFV), Brazil"
DESCRIPTION = "The package provides a LaTeX thesis template for the \
Universidade Federal de Vicosa (UFV), Brazil."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn48007"

RPM_NAME = "texlive-ecothesis-2023.209.1.2svn48007-54.1.noarch.rpm"
RPM_HASH = "9764cca5196aa8fae8c29b0f0f1040350ad7670bfc18b0df5e6596e2b347ee1e2224952cf44623c7b7e5f83226b7ba9c139b6e1e4c2d9bb3df5699f85f5ecee2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecothesis"

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
