SUMMARY = "Randomise the order of characters in strings"
DESCRIPTION = "The package provides a single macro \\randomize{TEXT} that \
typesets the characters of TEXT in random order, such that the \
resulting output appears correct, but most automated attempts \
to read the file will misunderstand it. This function allows \
one to include an email address in a TeX document and publish \
it online without fear of email address harvesters or spammers \
easily picking up the address."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-randtext-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "3d6d30414a04dd83007087b75a441a5d0b8c4d7ac663b01c456364fa7fe0d17c5618bd7428d957dc46f7db4c2a1dd15707f6986267be2d0cb153135e6d7f815d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-randtext.sty \
texlive-randtext"

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
