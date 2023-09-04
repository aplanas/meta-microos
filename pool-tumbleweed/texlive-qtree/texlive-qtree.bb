SUMMARY = "Draw tree structures"
DESCRIPTION = "The package offers support for drawing tree diagrams, and is \
especially suitable for linguistics use. It allows trees to be \
specified in a simple bracket notation, automatically \
calculates branch sizes, and supports both DVI/PostScript and \
PDF output by use of pict2e facilities. The package is a \
development of the existing qobitree package, offering a new \
front end."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1bsvn15878"

RPM_NAME = "texlive-qtree-2023.209.3.1bsvn15878-54.2.noarch.rpm"
RPM_HASH = "b17a125a485799dadbb247a2dda4ca9170c59fdc2ae7042529507a016ab45be38ca7516becb84910129bf6454355fd2f8bf981f62e90082f075a460acaa8302b"
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
