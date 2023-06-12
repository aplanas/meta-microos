SUMMARY = "Typeset guitar chords"
DESCRIPTION = "A LaTeX package for typesetting of guitar chord diagrams, \
including options for chord names, finger numbers and \
typesetting above lyrics. The bundle also includes a TCL script \
(chordbox.tcl) that provides a graphical application which \
creates LaTeX files that use gchords.sty."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.20svn29803"

RPM_NAME = "texlive-gchords-2023.201.1.20svn29803-52.1.noarch.rpm"
RPM_HASH = "868d24440a719176ed9174f21c0654aa26925bccb8f4af1fc518f590f8c86e35999d4df080024741bef09b287902abfd68a5a7940485ac58b1b430cac11f6913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gchords.sty) \
texlive-gchords"
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
