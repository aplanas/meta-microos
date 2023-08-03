SUMMARY = "TrueType version of Un-fonts"
DESCRIPTION = "The Un-fonts come from the HLaTeX as type1 fonts in 1998 by \
Koaunghi Un, he made type1 fonts to use with Korean TeX \
(HLaTeX) in the late 1990's and released it under the GPL \
license. They were converted to TrueType with the FontForge \
(PfaEdit) by Won-kyu Park in 2003. Core families (9 fonts): \
UnBatang, UnBatangBold: serif UnDotum, UnDotumBold: sans-serif \
UnGraphic, UnGraphicBold: sans-serif style UnPilgi, \
UnPilgiBold: script UnGungseo: cursive, brush-stroke"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn56291"

RPM_NAME = "texlive-unfonts-core-2023.209.svn56291-54.1.noarch.rpm"
RPM_HASH = "bf91be8e68295bde3c2cfe69c7a7510adb46efdede34f2e7f8c1056529d29adcf2fca4447f839278f8049767a697d0a1db5e65c2ad0418bcbb620cdfb53b0b56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-core"

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
texlive-unfonts-core-fonts"

inherit rpm
