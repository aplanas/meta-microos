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

PV = "2023.201.svn56291"

RPM_NAME = "texlive-unfonts-core-2023.201.svn56291-53.1.noarch.rpm"
RPM_HASH = "1787537c48605e92242fe6a3c22d6f8a09730207bcb28b4181481fbe3cae1e837cfaede469bf68731b9117d89fc446d4c052b217b37a3a1a7aece6902892eb12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-core"

RDEPENDS:${PN} += "/bin/sh \
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
