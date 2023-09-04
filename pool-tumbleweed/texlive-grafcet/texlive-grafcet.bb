SUMMARY = "Draw Grafcet/SFC with TikZ"
DESCRIPTION = "The package provides a library (GRAFCET) that can draw Grafcet \
Sequential Function Chart (SFC) diagrams, in accordance with EN \
60848, using Pgf/TikZ. L'objectif de la librairie GRAFCET est \
de permettre le trace de grafcet selon la norme EN 60848 a \
partir de Pgf/TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-2023.209.1.3.5svn22509-54.2.noarch.rpm"
RPM_HASH = "4566a4e2c2eb5764b5b265d00f591e14b613a210b0a95041419b4c706976a0b7031e1fbd8f0378fce9e23119970b9cb5c57e8cbdaf35ba4b4fcf7c07dddfadbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grafcet.sty \
texlive-grafcet"

RDEPENDS:${PN} += "/usr/bin/sh \
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
