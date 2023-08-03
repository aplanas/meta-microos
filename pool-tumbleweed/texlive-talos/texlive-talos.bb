SUMMARY = "A Greek cult font from the eighties"
DESCRIPTION = "A cult Greek font from the eighties, used at the University of \
Crete, Greece. It belonged to the first TeX installation in a \
Greek University and most probably the first TeX installation \
that supported the Greek language."
LICENSE = "LPPL-1.3c"

PV = "2023.209.1.0svn61820"

RPM_NAME = "texlive-talos-2023.209.1.0svn61820-55.1.noarch.rpm"
RPM_HASH = "7ca387540c132e49f455f0d1da48e2eaa0d35e6da4c1138ee481ec30c75988296ce2817af9606f7aeb847e6aee481d35af3d60388b4c8fa033bd2e6b99ceeee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-talos"

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
texlive-scripts-bin \
texlive-talos-fonts"

inherit rpm
