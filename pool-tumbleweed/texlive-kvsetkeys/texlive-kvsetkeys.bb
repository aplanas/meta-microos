SUMMARY = "Key value parser with default handler support"
DESCRIPTION = "This package provides \\kvsetkeys, a variant of package keyval's \
\\setkeys. It allows the user to specify a handler that deals \
with unknown options. Active commas and equal signs may be used \
(e.g. see babel's shorthands) and only one level of curly \
braces are removed from the values."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.19svn64632"

RPM_NAME = "texlive-kvsetkeys-2023.201.1.19svn64632-55.1.noarch.rpm"
RPM_HASH = "3a4db108700dca9023c76b0f01e1f9fe66f3e01ead5599fd0a7d0db94057e39fb35068d647a209aa9e20e26008bd47bfe4dd7bc57af21bf69b8243586e8de8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kvsetkeys.sty \
texlive-kvsetkeys"

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
