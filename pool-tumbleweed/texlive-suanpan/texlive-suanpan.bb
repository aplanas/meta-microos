SUMMARY = "MetaPost macros for drawing Chinese and Japanese abaci"
DESCRIPTION = "These macros are described in Denis Roegel: MetaPost macros for \
drawing Chinese and Japanese abaci, TUGboat (volume 30, number \
1, 2009, pages 74-79)"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-suanpan-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "2858c66442c730208844fc05d8a4d56d10999c61abe500834be4f661dd71742deb63d70bbd255a86d3ed64b6e9b7e06091fa09fa4addfe4b16160d2f72be18f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suanpan"

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
