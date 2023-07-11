SUMMARY = "LaTeX thesis template for the Universidade Federal de Vicosa (UFV), Brazil"
DESCRIPTION = "The package provides a LaTeX thesis template for the \
Universidade Federal de Vicosa (UFV), Brazil."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn48007"

RPM_NAME = "texlive-ecothesis-2023.201.1.2svn48007-53.2.noarch.rpm"
RPM_HASH = "1030792bceda5a452148627733c0bc650ed8d28e7ff89057f419abeb2987522a263c1335fbb77e5677a0b4be60271cb716fca087c7989de171928263c490a4f8"
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
