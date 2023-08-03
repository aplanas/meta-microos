SUMMARY = "Metafont version of tiles in the style of Slavik Jablan"
DESCRIPTION = "This is a small Metafont font to implement the modular tiles \
described by Slavik Jablan. For an outline of the theoretical \
structure of the tiles, see (for example) Jablan's JMM 2006 \
Exhibit."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn16364"

RPM_NAME = "texlive-jablantile-2023.209.svn16364-56.1.noarch.rpm"
RPM_HASH = "ba2a240a28b7ddcada276e8a6a96522af8a31d01d22dade7055fa1dcd3e309351c91d29a175903325734300e20255963f162a2e2ec9e4a0dd4fc7a9828f3a72c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jablantile"

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
