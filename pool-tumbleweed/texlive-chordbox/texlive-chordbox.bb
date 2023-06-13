SUMMARY = "Draw chord diagrams"
DESCRIPTION = "This package provides two macros for drawing chord diagrams, as \
may be found for example in chord charts/books and educational \
materials. They are composed as TikZ pictures and have several \
options to modify their appearance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51000"

RPM_NAME = "texlive-chordbox-2023.201.1.0svn51000-53.1.noarch.rpm"
RPM_HASH = "b5829ed05939444260d24065cd7ccccdf1d409d736b8ef3d132a16be5805a84983ae0240143a10e9e61756318afc09d2dda952e905baa1d5c47f03d3d32ec2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chordbox.sty) \
texlive-chordbox"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
tex(xifthen.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
