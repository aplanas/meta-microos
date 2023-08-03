SUMMARY = "A package for typesetting (short) poems"
DESCRIPTION = "A redefinition of the verse environment to make the \\\\ command \
optional for line ends and to give it a possibility of optical \
centering and `right-hanging' alignment of lines broken because \
of length."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-2023.209.0.0.73svn29803-54.1.noarch.rpm"
RPM_HASH = "473d2640b29d8b77ffbbe74ce2b2c52b691f67b17fe53a8403832be9b217b3e77711e806feab821c1d9ab10eccb34aa133a6bc8e0a0e5558aedf251fb45c1810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmverse.sty \
texlive-gmverse"

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
