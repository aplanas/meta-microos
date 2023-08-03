SUMMARY = "A simple way to create dynamic blocks for Beamer"
DESCRIPTION = "The package provides full customisation of the aspect and \
dimensions of blocks inside a presentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2bsvn35193"

RPM_NAME = "texlive-dynblocks-2023.209.0.0.2bsvn35193-54.1.noarch.rpm"
RPM_HASH = "28840f2e69943c61f4073e6788316524fb58952c1b9bcea0c898968822c323f98ee17cb6cda0a860999b03c8451a0ca185a10b821bdd1351460000032488a672"
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
