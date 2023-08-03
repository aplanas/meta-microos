SUMMARY = "A Gentle Introduction to TeX"
DESCRIPTION = "The 'Gentle Introduction' is the longest-established \
comprehensive free tutorial on the use of plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-gentle-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "1648490d63d74d4a49b9e022ab5a570209395e7b9435916b54b2a5c31f0c01776951f9ced856ffff88c34b79c9c9bab65391176a4309a42aac1ecc873382ff2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gentle"

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
