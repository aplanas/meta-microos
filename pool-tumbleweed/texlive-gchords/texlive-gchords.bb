SUMMARY = "Typeset guitar chords"
DESCRIPTION = "A LaTeX package for typesetting of guitar chord diagrams, \
including options for chord names, finger numbers and \
typesetting above lyrics. The bundle also includes a TCL script \
(chordbox.tcl) that provides a graphical application which \
creates LaTeX files that use gchords.sty."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.20svn29803"

RPM_NAME = "texlive-gchords-2023.209.1.20svn29803-53.1.noarch.rpm"
RPM_HASH = "dc96540a30cbd8967636bf7a9fd5c1ab9e3c8d1495fe5f5b9ed87ef19f75d22ccfd7e668a79f056f46a2621ee90b3c11e4485a5e0ef28cdb60e220927a1fa022"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gchords.sty \
texlive-gchords"

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
