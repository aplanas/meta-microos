SUMMARY = "Bidi-aware page grid in background"
DESCRIPTION = "The package is based on pagegrid."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn34632"

RPM_NAME = "texlive-bidipagegrid-2023.201.0.0.2svn34632-53.1.noarch.rpm"
RPM_HASH = "c47db57ba9366e6a1d4d0dfa948b2c0bd1100650375495e7ab21c6f0b464b35f52b9d2633a9af13a2da9719ea89af4ab0ba04bbe81be755106bdbcc83de678d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidipagegrid.sty \
texlive-bidipagegrid"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
