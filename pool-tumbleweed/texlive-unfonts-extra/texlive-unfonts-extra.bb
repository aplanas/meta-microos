SUMMARY = "TrueType version of Un-fonts"
DESCRIPTION = "The Un-fonts come from the HLaTeX as type1 fonts in 1998 by \
Koaunghi Un, he made type1 fonts to use with Korean TeX \
(HLaTeX) in the late 1990's and released it under the GPL \
license. They were converted to TrueType with the FontForge \
(PfaEdit) by Won-kyu Park in 2003. Extra families (10 fonts): \
UnPen, UnPenheulim: script UnTaza: typewriter style UnBom: \
decorative UnShinmun UnYetgul: old Korean printing style \
UnJamoSora, UnJamoNovel, UnJamoDotum, UnJamoBatang"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn56291"

RPM_NAME = "texlive-unfonts-extra-2023.201.svn56291-53.1.noarch.rpm"
RPM_HASH = "174537dc48f5285baaf69134126c37040afa074a0b278cf93e0b2dab691c0924279280c89bfa3338f858e43cddcf662c596e71acb4784b1f69f827265cd7afd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-extra"

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
texlive-unfonts-extra-fonts"

inherit rpm
