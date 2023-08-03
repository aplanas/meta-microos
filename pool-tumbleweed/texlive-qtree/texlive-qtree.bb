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

RPM_NAME = "texlive-qtree-2023.209.3.1bsvn15878-54.1.noarch.rpm"
RPM_HASH = "a25fc89e1a0bdef2070ba8804df9a8c22d79f4a1bdbedcba7b2ca0018571d635668e8286244234581f3c70e754f69ec22edca2c8d3b20e2eb7c7ed2aa520d34d"
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
