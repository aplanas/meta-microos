SUMMARY = "Declare new PGF shapes"
DESCRIPTION = "The package simplifies production of custom shapes with correct \
anchor borders, in PGF/TikZ; the only requirement is a PGF path \
describing the anchor border. The package also provides macros \
that help with the management of shape parameters, and the \
definition of anchor points."
LICENSE = "LPPL-1.0"

PV = "2023.208.2.1svn28973"

RPM_NAME = "texlive-makeshape-2023.208.2.1svn28973-53.1.noarch.rpm"
RPM_HASH = "3185640e6a9540c559daba674aba0b9d721db4da7ea6d453cdbcb54871faeb4e660e6a86c541101d1117b7e567be2d9b10467b20ac4731ed8adae0971b832d95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makeshape.sty \
texlive-makeshape"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
