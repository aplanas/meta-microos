SUMMARY = "Adobe Glyph List and TeX extensions"
DESCRIPTION = "Map between traditional Adobe glyph names and Unicode points, \
maintained by Adobe. The additional texglyphlist.txt is \
maintained as part of lcdf-typetools."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-glyphlist-2023.209.svn54074-54.2.noarch.rpm"
RPM_HASH = "baaabfea1c055042cd061800f0d534f8b20a7c94083e22b8573ab5656dbe40ca72d9842670adefab7c5ed346d1cad45f7801790b23d0ccba1c289358a1796f9a"
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
