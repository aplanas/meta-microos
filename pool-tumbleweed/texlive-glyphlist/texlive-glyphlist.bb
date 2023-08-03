SUMMARY = "Adobe Glyph List and TeX extensions"
DESCRIPTION = "Map between traditional Adobe glyph names and Unicode points, \
maintained by Adobe. The additional texglyphlist.txt is \
maintained as part of lcdf-typetools."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-glyphlist-2023.209.svn54074-54.1.noarch.rpm"
RPM_HASH = "c5aa9332bb0e7be6b89b2dcd0c14ab2e7a84b5671ff8acfa529c0526d38464cf1c781e04c69ed3fb691a43c2e36f8816863fa975ad874e8c0e7e82eeb3dbfa74"
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
