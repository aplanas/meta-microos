SUMMARY = "Draw Grafcet/SFC with TikZ"
DESCRIPTION = "The package provides a library (GRAFCET) that can draw Grafcet \
Sequential Function Chart (SFC) diagrams, in accordance with EN \
60848, using Pgf/TikZ. L'objectif de la librairie GRAFCET est \
de permettre le trace de grafcet selon la norme EN 60848 a \
partir de Pgf/TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-2023.201.1.3.5svn22509-53.2.noarch.rpm"
RPM_HASH = "36f5c1d3c23b908c8f93acb58ff686ca285f0c36a675722d0dd6d819223c6a4984a5a7cea7d2a72bbc942e8ef336610628df850b53c69eb6ee4e116a5ed10f06"
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
