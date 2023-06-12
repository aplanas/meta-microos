SUMMARY = "Color separation"
DESCRIPTION = "Support for colour separation when using dvips."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn13293"

RPM_NAME = "texlive-colorsep-2023.201.svn13293-53.1.noarch.rpm"
RPM_HASH = "88451ce5692a2d3d91364403c87c6e160c5d178b651dfbc111211872a8a85867ba2adbac937e321a862e87fa4120d805c86ab2378e4eb45fac0c60a1fa3518ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorsep"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
