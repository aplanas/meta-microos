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

RPM_NAME = "texlive-randtext-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "3fa5f29da739563c89b3417b34ca9275846652c8416368f91dddd4bdb68f07cec6862c3bf5457f53c9039a8849ca0d273bab0335ff707c593137651f763d448b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(randtext.sty) \
texlive-randtext"

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
