SUMMARY = "Plot data using PSTricks"
DESCRIPTION = "The package provides plotting of data (typically from external \
files), using PSTricks. Plots may be configured using a wide \
variety of parameters."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.94svn65346"

RPM_NAME = "texlive-pst-plot-2023.201.1.94svn65346-53.2.noarch.rpm"
RPM_HASH = "b746afc8572417f156c4650094c37e12f24cb6b9fe8e9094e7c2d87fc576286854753c4edd11c0993a0e480364ea3d2d56057bc6cfdc9b8ed99c3e11ce63d3d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-plot.sty \
tex-pst-plot.tex \
tex-pst-plot97.tex \
texlive-pst-plot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
