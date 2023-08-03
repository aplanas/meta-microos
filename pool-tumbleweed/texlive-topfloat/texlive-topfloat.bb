SUMMARY = "Move floats to the top of the page"
DESCRIPTION = "The topfloat package"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn19084"

RPM_NAME = "texlive-topfloat-2023.209.svn19084-53.1.noarch.rpm"
RPM_HASH = "85e46ef2ed28f139056820ac1ec3aa90dff5cfa70fdfbc0d8cae3a3945a6870b3add7a813cd2ddc65608ceb5c0a5053ae00cf08562a5cf6b6b7cc01e33cc13b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-topfloat.sty \
texlive-topfloat"

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
