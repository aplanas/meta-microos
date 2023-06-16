SUMMARY = "Provide links between source and PDF"
DESCRIPTION = "The package runs with pdfTeX or XeTeX, and creates an auxiliary \
file with geometrical information to permit references back and \
forth between source and PDF, assuming a conforming editor and \
PDF viewer."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20373"

RPM_NAME = "texlive-pdfsync-2023.201.svn20373-51.1.noarch.rpm"
RPM_HASH = "17e2558600203e428a624d2d7dbfac67538ae39dc66a7715d9aa466646b2df82aec03802fb94c8f6ee098e48763d6664bf1063439a19d270a16d3529c2c5e292"
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
