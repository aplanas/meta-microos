SUMMARY = "Page organisation, modelled on CSS facilities"
DESCRIPTION = "The package provides the means for LaTeX to implement a grid \
system as known from CSS grid systems. The facility is useful \
for creating box layouts as used in brochures."
LICENSE = "Apache-1.0"

PV = "2023.209.0.0.3.0svn32981"

RPM_NAME = "texlive-grid-system-2023.209.0.0.3.0svn32981-54.1.noarch.rpm"
RPM_HASH = "fb7ca1606b2ad283e70ab0e230f8dc9e40f09cfe8bcbe86f6030cbc22b495292784758548409623c64be0f2114c4de53e16ea59434b0928aff51e1f0c3d08ac8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grid-system.sty \
texlive-grid-system"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-environ.sty \
tex-forloop.sty \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
