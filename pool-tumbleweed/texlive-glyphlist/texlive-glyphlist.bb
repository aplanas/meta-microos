SUMMARY = "Adobe Glyph List and TeX extensions"
DESCRIPTION = "Map between traditional Adobe glyph names and Unicode points, \
maintained by Adobe. The additional texglyphlist.txt is \
maintained as part of lcdf-typetools."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-glyphlist-2023.201.svn54074-53.1.noarch.rpm"
RPM_HASH = "1e8e97a714ef731335c437abc5351160a4e616b77b4eef458fdaa2839d0ec437a0124fb4b51e7fe481209ab6911a6535c4c91d7df1b43c5fc075055574cd3fc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glyphlist"

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
