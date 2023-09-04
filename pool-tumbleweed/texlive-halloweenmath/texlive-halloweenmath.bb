SUMMARY = "Scary and creepy math symbols with AMS-LaTeX integration"
DESCRIPTION = "The package defines a handful of commands for typesetting \
mathematical symbols of various kinds, ranging from 'large' \
operators to extensible arrow-like relations and growing \
arrow-like math accents that all draw from the classic \
Halloween-related iconography (pumpkins, witches, ghosts, cats, \
and so on) while being, at the same time, seamlessly integrated \
within the rest of the mathematics produced by (AmS-)LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.11svn52602"

RPM_NAME = "texlive-halloweenmath-2023.209.0.0.11svn52602-54.2.noarch.rpm"
RPM_HASH = "ade8c62a8491f4f4a3c26ea766d060c7827e9c2446505ebc674976fc92fa5a555835d2da6634bbde820ffe7181821fb471327c52168d6735c126de82f7a7d77d"
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
