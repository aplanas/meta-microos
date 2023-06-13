SUMMARY = "Easy font substitution"
DESCRIPTION = "Many free fonts are extensions of a basic font family with new \
glyphs or shapes. Such fonts may be given a new name due to \
licence reasons or to the creator's preference. The package \
facilitates the task of setting up a font family as substitute \
for another one, using its \\substitutefont command."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.4svn32066"

RPM_NAME = "texlive-substitutefont-2023.201.0.0.1.4svn32066-57.1.noarch.rpm"
RPM_HASH = "d8ac9d3bf378a67c98ad85bddb0b1008df16cd160f0785455a7814b41701d5c3d9adf5e228ef78cbc917c6e4a685a6ef374536218ac643b8539a63e6acacc10c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(substitutefont.sty) \
texlive-substitutefont"

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
texlive-scripts-bin"

inherit rpm
