SUMMARY = "Add chords to lyrics"
DESCRIPTION = "The package provides the means to specify guitar chords to be \
played with each part of the lyrics of a song. The syntax of \
the macros reduces the chance of failing to provide a chord \
where one is needed, and the structure of the macros ensures \
that the chord specification appears immediately above the \
start of the lyric."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn32484"

RPM_NAME = "texlive-gtrcrd-2023.209.1.1svn32484-54.1.noarch.rpm"
RPM_HASH = "75959d80b45b86c4e74bc3b5b9405b6a7c5e680db3109e812a793a2a4f6a4b0a7d96c6a96d4120339528839fa3a8084e264fdab3c879b9a61699ebd468db0f9f"
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
