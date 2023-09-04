SUMMARY = "Easy creation of potential energy curve diagrams"
DESCRIPTION = "The package provides the facility of drawing potential energy \
curve diagrams with just a few simple commands. The package \
cannot (yet) be considered stable."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1dsvn34486"

RPM_NAME = "texlive-endiagram-2023.209.0.0.1dsvn34486-54.2.noarch.rpm"
RPM_HASH = "06b7da2a138d2657fdc186ac9083d922ff82b355230b2c60fce699625d3f30ca0e0d902e88b34bd00b979c8ff90450aa3c224d96d74d264e5691393a0610c92d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endiagram.sty \
texlive-endiagram"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
