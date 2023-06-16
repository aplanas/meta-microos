SUMMARY = "Babel support for Turkish documents"
DESCRIPTION = "The package provides support, within babel, of the Turkish \
language."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn51560"

RPM_NAME = "texlive-babel-turkish-2023.201.1.4svn51560-53.1.noarch.rpm"
RPM_HASH = "a737d002cf11322ae40a56c29287c2c726ef48deddc888b83ad0dfc78ff3dc418af5755637eae1fe9c422767c64119a5b4c40f552d868c7af3c8c0bc35dad229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-turkish.ldf \
texlive-babel-turkish"

RDEPENDS:${PN} += "/usr/bin/sh \
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
