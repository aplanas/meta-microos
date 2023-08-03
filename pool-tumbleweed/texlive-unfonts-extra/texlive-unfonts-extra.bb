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

PV = "2023.209.svn56291"

RPM_NAME = "texlive-unfonts-extra-2023.209.svn56291-54.1.noarch.rpm"
RPM_HASH = "f965812a9938a295e43963a063e671492fd7b9f5677f4e443b81cb611a9be532ee89c6ff482de339088dfc8ff90ee45eb6acaf3708a8780d768b95914cc65a0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unfonts-extra"

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
texlive-unfonts-extra-fonts"

inherit rpm
