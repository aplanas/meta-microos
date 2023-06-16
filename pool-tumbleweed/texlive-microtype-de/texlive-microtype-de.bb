SUMMARY = "Translation into German of the documentation of microtype"
DESCRIPTION = "The microtype-de package"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn54080"

RPM_NAME = "texlive-microtype-de-2023.201.2.4svn54080-54.1.noarch.rpm"
RPM_HASH = "39e2fd47bdc7bd0e874c8345b83238dd992dcc46cd8891a4b62e639ab21fbf1ebb1ff605ebc9793b7635e499be31a8608e415ba4ca61057b71ed01f11e3a66cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-microtype-de"

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
