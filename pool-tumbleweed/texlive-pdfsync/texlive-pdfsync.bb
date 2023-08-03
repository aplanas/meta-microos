SUMMARY = "Provide links between source and PDF"
DESCRIPTION = "The package runs with pdfTeX or XeTeX, and creates an auxiliary \
file with geometrical information to permit references back and \
forth between source and PDF, assuming a conforming editor and \
PDF viewer."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20373"

RPM_NAME = "texlive-pdfsync-2023.209.svn20373-52.1.noarch.rpm"
RPM_HASH = "c482508bc5267c5d2be6cd8ae7841afff27b3e47f390755722e60da73ab0a4b31dac5a6eedc933040c0b16d25a5ce0eee6707f9b1c9637bfc33fa16a423b1b08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfsync.sty \
texlive-pdfsync"

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
