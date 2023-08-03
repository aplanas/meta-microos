SUMMARY = "Mini-fonts for figured-bass notation in music"
DESCRIPTION = "This package consists of three mini-fonts (and associated \
metrics) of conventional ligatures for the figured-bass \
notations 2+, 4+, 5+, 6+ and 9+ in music manuscripts. The fonts \
are usable with Computer Modern Roman and Sans, and \
Palatino/Palladio, respectively."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.3svn28943"

RPM_NAME = "texlive-figbas-2023.209.1.0.3svn28943-53.1.noarch.rpm"
RPM_HASH = "191a6f2645e0c3406c2f8fa04ecfa1a28994383402483bf6133c4e564cded2e601fb527e1b31f2a30bb3d0768fe18984dbf362acd9fbe97dcb53c096b496d108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmrj.tfm \
tex-cmssj.tfm \
tex-figbas.map \
tex-plrj.tfm \
texlive-figbas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-figbas-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
