SUMMARY = "Babel support for Belarusian"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Belarusian."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn49022"

RPM_NAME = "texlive-babel-belarusian-2023.201.1.5svn49022-53.1.noarch.rpm"
RPM_HASH = "a3daaf9b57c6fb1dd7ca0214942376f6e9c5ead49357a7409b6a4c8b315ef23dbc0a77bd1e0bf6690e65008a6185cb5d16dc2e8bd3732f3ac7e62984b61991d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-belarusian.ldf \
texlive-babel-belarusian"

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
