SUMMARY = "A Beamer theme for academic presentations"
DESCRIPTION = "The package developed for academic purposes. The distribution \
includes nothing more than style file needed for preparing \
presentations."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn20765"

RPM_NAME = "texlive-beamerthemenirma-2023.209.0.0.1svn20765-54.1.noarch.rpm"
RPM_HASH = "2eb3f097a765969825de89035aa445773484f42ae4422671da83092213f16800184170560419add3623d3db48a5bd89e8e7ce457ae3170eaef2de28ccb2d9c9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemenirma.sty \
texlive-beamerthemenirma"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-beamerbasethemes.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
