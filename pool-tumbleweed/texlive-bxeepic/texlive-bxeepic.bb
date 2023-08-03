SUMMARY = "Eepic facilities using pict2e"
DESCRIPTION = "The package provides an eepic driver to use pict2e facilities."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn30559"

RPM_NAME = "texlive-bxeepic-2023.209.0.0.2svn30559-53.1.noarch.rpm"
RPM_HASH = "cbb588501878f3cb1087df9c754491db5b4c651b8afe0e063257ad304fa8687c583d690ecf01038a7252b0e0c1cb83a36eec59dfaa4ead567310530e3d09d63e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxdpxp2e.def \
tex-bxeepic.sty \
texlive-bxeepic"

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
