SUMMARY = "Add chords to lyrics"
DESCRIPTION = "The package provides the means to specify guitar chords to be \
played with each part of the lyrics of a song. The syntax of \
the macros reduces the chance of failing to provide a chord \
where one is needed, and the structure of the macros ensures \
that the chord specification appears immediately above the \
start of the lyric."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-2023.201.1.1svn32484-53.1.noarch.rpm"
RPM_HASH = "6611311f860bb1fd3b533f2e4aa5c3eb7d7301b8582c8fb2d9ef8ca1e8dcb3ae8dca345855d7917ff042661480819e5e4f5ca70b8f18cdb8bfed424f13bb1878"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtrcrd.sty \
texlive-gtrcrd"

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
