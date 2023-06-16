SUMMARY = "Babel support for Hungarian (Magyar)"
DESCRIPTION = "The package provides a language definition file that enables \
support of Magyar (Hungarian) with babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5csvn49701"

RPM_NAME = "texlive-babel-hungarian-2023.201.1.5csvn49701-53.1.noarch.rpm"
RPM_HASH = "4bea9cfb4074f8803cd4ae14016c8633cc6843ba5527836fa67f6897f9048d79621cef0902f5e40d4de960e8738c055b2d144310a2d6da86da9e6ae934dae4e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-magyar.ldf \
texlive-babel-hungarian"

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
