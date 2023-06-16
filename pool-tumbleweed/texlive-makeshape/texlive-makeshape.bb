SUMMARY = "Declare new PGF shapes"
DESCRIPTION = "The package simplifies production of custom shapes with correct \
anchor borders, in PGF/TikZ; the only requirement is a PGF path \
describing the anchor border. The package also provides macros \
that help with the management of shape parameters, and the \
definition of anchor points."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn28973"

RPM_NAME = "texlive-makeshape-2023.201.2.1svn28973-52.1.noarch.rpm"
RPM_HASH = "b8834df91ce30c4b847fd758dd7904ad5cc4a3279aa94865392802b13928a29cd915a3259bb5da9a86ef926c51c0a8851ba12205bc62c5dbc7ee0b484001136f"
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
