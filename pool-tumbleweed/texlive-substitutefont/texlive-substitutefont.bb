SUMMARY = "Easy font substitution"
DESCRIPTION = "Many free fonts are extensions of a basic font family with new \
glyphs or shapes. Such fonts may be given a new name due to \
licence reasons or to the creator's preference. The package \
facilitates the task of setting up a font family as substitute \
for another one, using its \\substitutefont command."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.4svn32066"

RPM_NAME = "texlive-substitutefont-2023.209.0.0.1.4svn32066-58.1.noarch.rpm"
RPM_HASH = "f1b4341e70d5a6d716ff66650e4e0c6e4fc7ea8fc054896df644be8f3a15169ed237d5e019f4ffc3d3302fb575381f3367090fbca4926e4af2996979200c3181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-substitutefont.sty \
texlive-substitutefont"

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
