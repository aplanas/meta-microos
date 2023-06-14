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

RPM_NAME = "texlive-qtree-2023.201.3.1bsvn15878-53.1.noarch.rpm"
RPM_HASH = "a723d7d40f442671b429e44bddb9b837bbe21e1736020b82c580ca8089d027ef7f51d7e17c2d3eb10d6b70de7815d533f9762589bab753c57f38f41a49f8388b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qtree.sty \
texlive-qtree"

RDEPENDS:${PN} += "/bin/sh \
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
