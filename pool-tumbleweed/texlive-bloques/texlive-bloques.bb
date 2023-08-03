SUMMARY = "Generate control diagrams"
DESCRIPTION = "The package uses TikZ to provide commands for generating \
control diagrams (specially in power electronics)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn22490"

RPM_NAME = "texlive-bloques-2023.209.1.0svn22490-53.1.noarch.rpm"
RPM_HASH = "2439142a148ea287a72b5a60550bd4b5f656ac940b0854831dda24c520dacb72aa8e6531c180fc9718b009b4b16fb0d92018ae7e8917126987414160b6eeb765"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bloques.sty \
texlive-bloques"

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
