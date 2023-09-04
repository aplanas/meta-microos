SUMMARY = "Add chords to lyrics"
DESCRIPTION = "The package provides the means to specify guitar chords to be \
played with each part of the lyrics of a song. The syntax of \
the macros reduces the chance of failing to provide a chord \
where one is needed, and the structure of the macros ensures \
that the chord specification appears immediately above the \
start of the lyric."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-2023.209.1.1svn32484-54.2.noarch.rpm"
RPM_HASH = "0fccbbfb4ea95825bdc34b3924107d65630a6c9991fe8240e63892292b9a474d6c2f597b99461c560d3f91d7ae0bfae48e6de71551a19d86042c0e432dd2f997"
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
