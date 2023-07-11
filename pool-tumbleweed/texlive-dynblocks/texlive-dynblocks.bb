SUMMARY = "A simple way to create dynamic blocks for Beamer"
DESCRIPTION = "The package provides full customisation of the aspect and \
dimensions of blocks inside a presentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-2023.201.0.0.2bsvn35193-53.2.noarch.rpm"
RPM_HASH = "933c6715d8919c23765febd2be4478dc85f0f36a2036f0e62a18df47c667dd4e58d3b554911978c01e5454ca43598389d72fbafde9670c5d1bc59320b9ed36b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dynblocks.sty \
texlive-dynblocks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
