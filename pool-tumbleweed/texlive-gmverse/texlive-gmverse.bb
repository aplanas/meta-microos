SUMMARY = "A package for typesetting (short) poems"
DESCRIPTION = "A redefinition of the verse environment to make the \\\\ command \
optional for line ends and to give it a possibility of optical \
centering and `right-hanging' alignment of lines broken because \
of length."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-2023.201.0.0.73svn29803-53.2.noarch.rpm"
RPM_HASH = "c05635fd489f8f6a10d16f28f923a92c4df74a14a11e623c9b0cb523dd913e86ad6253ff8067bd30c5ae2692e3729037477d68cfe25e214abd8e2fcfd5308030"
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
