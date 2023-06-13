SUMMARY = "Typeset Galois connections"
DESCRIPTION = "The package deals with connections in two-dimensional style, \
optionally in colour."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-galois-2023.201.1.5svn15878-52.1.noarch.rpm"
RPM_HASH = "80cb1dad2bb8a82a1a43c93ad092385132d492842c8866e091491b732cf3d6012b7e33202b4a5feaf5d4d1e2dc61e887c2be67593467673ad2bd7d84fff57196"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(galois.sty) \
texlive-galois"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
