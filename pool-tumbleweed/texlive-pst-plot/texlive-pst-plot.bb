SUMMARY = "Plot data using PSTricks"
DESCRIPTION = "The package provides plotting of data (typically from external \
files), using PSTricks. Plots may be configured using a wide \
variety of parameters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.94svn65346"

RPM_NAME = "texlive-pst-plot-2023.209.1.94svn65346-54.1.noarch.rpm"
RPM_HASH = "26c7fa1cca4802ceedca3342b58cbba5f8c7cd9c7325411a78010bbb177ba1d62e5b2a3d8dfee55537079c9190d401ec1f4b6bfa024eb1b76400e11155499963"
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
