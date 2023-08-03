SUMMARY = "Support for Malay within babel"
DESCRIPTION = "This is the babel style for Malay."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0msvn43234"

RPM_NAME = "texlive-babel-malay-2023.209.1.0msvn43234-54.1.noarch.rpm"
RPM_HASH = "dca73b0ee692b6dc46cd5a677874ef2344b276120c40301dc05289bbb4a01adcd74bb9c3c7cd00cf935d9be68896990d0e72b500b1b98a9224297951204ce472"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bahasam.ldf \
tex-malay.ldf \
tex-melayu.ldf \
tex-meyalu.ldf \
texlive-babel-malay"

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
