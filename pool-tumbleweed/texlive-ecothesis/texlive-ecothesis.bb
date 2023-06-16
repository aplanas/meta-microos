SUMMARY = "LaTeX thesis template for the Universidade Federal de Vicosa (UFV), Brazil"
DESCRIPTION = "The package provides a LaTeX thesis template for the \
Universidade Federal de Vicosa (UFV), Brazil."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn48007"

RPM_NAME = "texlive-ecothesis-2023.201.1.2svn48007-53.1.noarch.rpm"
RPM_HASH = "656d8c5649c586bd4b32b0948ecd61286ec5e23db9f9f942ba3d8d73589809f353063d38716a1c02fef29f84cbacd057133ca364c12099050e8dede5ab3e5623"
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
