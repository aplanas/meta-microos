SUMMARY = "Align terms and members in math expressions"
DESCRIPTION = "This package allows to align terms and members between lines \
containing math expressions."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn56966"

RPM_NAME = "texlive-autoaligne-2023.201.1.5svn56966-53.1.noarch.rpm"
RPM_HASH = "ea69725d2eee3d1b1ebf7dce772ce7c48220c401a5a927cd6cfa3815b70f536d83c954af7189a6cca1d5c29910b6de0b3e4ac7c923829339e66e9379c81e6692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(autoaligne-fr.tex) \
tex(autoaligne.sty) \
tex(autoaligne.tex) \
texlive-autoaligne"

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
