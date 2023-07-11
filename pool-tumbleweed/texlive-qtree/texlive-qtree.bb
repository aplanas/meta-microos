SUMMARY = "Draw tree structures"
DESCRIPTION = "The package offers support for drawing tree diagrams, and is \
especially suitable for linguistics use. It allows trees to be \
specified in a simple bracket notation, automatically \
calculates branch sizes, and supports both DVI/PostScript and \
PDF output by use of pict2e facilities. The package is a \
development of the existing qobitree package, offering a new \
front end."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1bsvn15878"

RPM_NAME = "texlive-qtree-2023.201.3.1bsvn15878-53.2.noarch.rpm"
RPM_HASH = "cbe2ac55c89bb889660263f188228cbd097373bb49b7cd5b8757c062b55ba415ec0763b92e2a2eda2496cd86c065b8462ab1e5c6f39cdb83735e2ea9d51c9c9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qtree.sty \
texlive-qtree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
