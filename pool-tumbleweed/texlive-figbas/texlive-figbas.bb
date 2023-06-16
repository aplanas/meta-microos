SUMMARY = "Mini-fonts for figured-bass notation in music"
DESCRIPTION = "This package consists of three mini-fonts (and associated \
metrics) of conventional ligatures for the figured-bass \
notations 2+, 4+, 5+, 6+ and 9+ in music manuscripts. The fonts \
are usable with Computer Modern Roman and Sans, and \
Palatino/Palladio, respectively."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn28943"

RPM_NAME = "texlive-figbas-2023.201.1.0.3svn28943-52.1.noarch.rpm"
RPM_HASH = "5de05cf5a2253e3a56fd7d1aa41215bd6e758d5c2dbd6c2408b116c6f0073e742b8ce96742c7046ecf8292a5b6172880c8f59ecb6ce5d86b67b988115813e680"
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
