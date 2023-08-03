SUMMARY = "Randomise the order of characters in strings"
DESCRIPTION = "The package provides a single macro \\randomize{TEXT} that \
typesets the characters of TEXT in random order, such that the \
resulting output appears correct, but most automated attempts \
to read the file will misunderstand it. This function allows \
one to include an email address in a TeX document and publish \
it online without fear of email address harvesters or spammers \
easily picking up the address."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-randtext-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "c4337953a2a51646082fea3319500e9b6ce6e12e2639259302ffc21d49acd7e3834fc97b74cbd689e46c35875c57f41fa41e1b6da999ed6605a2a249a92699ec"
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
