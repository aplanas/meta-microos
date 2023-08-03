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

RPM_NAME = "texlive-halloweenmath-2023.209.0.0.11svn52602-54.1.noarch.rpm"
RPM_HASH = "e205b2966860ca2db63d591e8f54a98da1af255b9dc3fd7014252b0221320793d050c5a454f939ae9f1aa87880d69de0284981f3d9234bad9cf8e8ced578020c"
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
