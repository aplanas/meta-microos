SUMMARY = "Contributed beamer theme"
DESCRIPTION = "A theme for beamer presentations."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn21977"

RPM_NAME = "texlive-beamerthemejltree-2023.209.1.1svn21977-54.1.noarch.rpm"
RPM_HASH = "27e9f94469ed2b181efad3325a0f4f2273637921c71685ad2e4947831ec8ed606081c9c14f7e4a10092a110a69563150eecdfe02049e95ed72e0de53e37ae312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemeJLTree.sty \
texlive-beamerthemejltree"

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
