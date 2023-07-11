SUMMARY = "Add chords to lyrics"
DESCRIPTION = "The package provides the means to specify guitar chords to be \
played with each part of the lyrics of a song. The syntax of \
the macros reduces the chance of failing to provide a chord \
where one is needed, and the structure of the macros ensures \
that the chord specification appears immediately above the \
start of the lyric."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-2023.201.1.1svn32484-53.2.noarch.rpm"
RPM_HASH = "c67e8c138f2eaccc95219377d6bd3c8b3abd857a47314f22f0a3f87a832bc3c0a5d477231119ab2b77376001840ec5190e56051fb2df7d93407f08dafe2744b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gtrcrd.sty \
texlive-gtrcrd"

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
