SUMMARY = "A Preprocessor that generates note-spacing commands for MusiXTeX scores"
DESCRIPTION = "This program simplifies the creation of MusiXTeX scores by \
converting (non-standard) commands of the form \\anotes ... \\en \
into one or more conventional note-spacing commands, as \
determined by the note values themselves, with \\sk spacing \
commands inserted as necessary. The coding for an entire \
measure can be entered one part at a time, without concern for \
note-spacing changes within the part or spacing requirements of \
other parts. For example, \\anotes\\qa J\\qa K&\\ca l\\qa m\\ca n\\en \
generates \\Notes\\qa J\\sk\\qa K\\sk&\\ca l\\qa m\\sk\\ca n\\en ."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn58211"

RPM_NAME = "texlive-autosp-2023.201.svn58211-53.1.noarch.rpm"
RPM_HASH = "63513be5ef5c198339300298493f5f8a560c0420addda99c48095ec8e2b6bf45c0b5adf46043c0276a586007e59d96af9efd72c448ee9d1bebbc9f44b89c865c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-autosp.1 \
man-tex2aspc.1 \
texlive-autosp"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-autosp-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
