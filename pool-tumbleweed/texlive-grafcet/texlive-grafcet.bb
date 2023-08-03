SUMMARY = "Draw Grafcet/SFC with TikZ"
DESCRIPTION = "The package provides a library (GRAFCET) that can draw Grafcet \
Sequential Function Chart (SFC) diagrams, in accordance with EN \
60848, using Pgf/TikZ. L'objectif de la librairie GRAFCET est \
de permettre le trace de grafcet selon la norme EN 60848 a \
partir de Pgf/TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.5svn22509"

RPM_NAME = "texlive-grafcet-2023.209.1.3.5svn22509-54.1.noarch.rpm"
RPM_HASH = "6aa2464d9508bb2dd18728bf69429f189d2a78696d30ff779782a3e5837a50a7d365061174c3577e73e352930c0f230eb68402c889f5b404053a6c4cbf5dba6d"
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
