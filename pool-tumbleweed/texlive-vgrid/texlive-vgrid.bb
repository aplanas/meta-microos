SUMMARY = "Overlay a grid on the printed page"
DESCRIPTION = "The package overlays a grid (whose spacing is \\baselineskip, \
which offers guidlines for considering the 'rhythm' of the \
document on the page."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn32457"

RPM_NAME = "texlive-vgrid-2023.209.0.0.1svn32457-54.1.noarch.rpm"
RPM_HASH = "4f7c60474dcf75994c16e05455d26fa53c31e30ef79331173571aa8ccc36432458fc07d9352b8a1ad7eb4c87316544d3e816f0cb77fffd427af45c488bbbe2a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vgrid.sty \
texlive-vgrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
tex-ifoddpage.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
