SUMMARY = "Draw Grafcet/SFC with TikZ"
DESCRIPTION = "The package provides a library (GRAFCET) that can draw Grafcet \
Sequential Function Chart (SFC) diagrams, in accordance with EN \
60848, using Pgf/TikZ. L'objectif de la librairie GRAFCET est \
de permettre le trace de grafcet selon la norme EN 60848 a \
partir de Pgf/TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-2023.201.1.3.5svn22509-53.1.noarch.rpm"
RPM_HASH = "7c49508abbce4e72464ce6aa59f5823c1056e22144190886a11f180a3d8259e759375114d08b67ff7e1192645c9c693e4e16053f23460f5242a36e11f2057dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grafcet.sty \
texlive-grafcet"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifsym.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
