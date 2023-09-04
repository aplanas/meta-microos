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

RPM_NAME = "texlive-randtext-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "c91957cec1c3d802f56ab7d2865e93cf6a1e72b5625f3066b7c961b234357bd62b3b89d5f269d2181ae5119a20bf8abcf27e831fc6b60c16b123d370d2f794c4"
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
