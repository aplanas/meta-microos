SUMMARY = "Plot data using PSTricks"
DESCRIPTION = "The package provides plotting of data (typically from external \
files), using PSTricks. Plots may be configured using a wide \
variety of parameters."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.94svn65346"

RPM_NAME = "texlive-pst-plot-2023.209.1.94svn65346-54.2.noarch.rpm"
RPM_HASH = "98da34d79864cc0f2a5168d720284d198636bfbbabc27d9b1ecacc225cbf30d51cb4f0d8d8ed6546a10df1e93a9ceb62c07ddbace1f3c6de5a37297776f80e10"
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
