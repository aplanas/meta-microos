SUMMARY = "LaTeX thesis template for the Universidade Federal de Vicosa (UFV), Brazil"
DESCRIPTION = "The package provides a LaTeX thesis template for the \
Universidade Federal de Vicosa (UFV), Brazil."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn48007"

RPM_NAME = "texlive-ecothesis-2023.209.1.2svn48007-54.2.noarch.rpm"
RPM_HASH = "8feeb498ecb5796df5aa44efc03a6bd6bdb71d19674b649b27e80722b2b2dbf0caef8deb462f2466c0dc90d923ef03945803a8f9ec36b8262e9549e7b3abbfd7"
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
