SUMMARY = "Adobe Glyph List and TeX extensions"
DESCRIPTION = "Map between traditional Adobe glyph names and Unicode points, \
maintained by Adobe. The additional texglyphlist.txt is \
maintained as part of lcdf-typetools."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54074"

RPM_NAME = "texlive-glyphlist-2023.201.svn54074-53.2.noarch.rpm"
RPM_HASH = "2bca2e89b73b9db25de56fe746c0a25bc2940e7526520334a258cb6cd4819e58ac3ac29ed51a3993941e5f23271dfa759778e5b450cc655e425ee7cd592b7a6f"
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
