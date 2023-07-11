SUMMARY = "Scary and creepy math symbols with AMS-LaTeX integration"
DESCRIPTION = "The package defines a handful of commands for typesetting \
mathematical symbols of various kinds, ranging from 'large' \
operators to extensible arrow-like relations and growing \
arrow-like math accents that all draw from the classic \
Halloween-related iconography (pumpkins, witches, ghosts, cats, \
and so on) while being, at the same time, seamlessly integrated \
within the rest of the mathematics produced by (AmS-)LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.11svn52602"

RPM_NAME = "texlive-halloweenmath-2023.201.0.0.11svn52602-53.2.noarch.rpm"
RPM_HASH = "fe248cbf2ad81e9d82a61d3b9001c924fa6a7d75725e209a6086fa4149ab88a7d4906d2f6a76679ef06a1ef88b50ef8b39b22953246af0d4ee91e0bd4239a1cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-halloweenmath.sty \
texlive-halloweenmath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
