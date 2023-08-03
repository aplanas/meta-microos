SUMMARY = "Simulation of modulation and demodulation"
DESCRIPTION = "The package allows the simulation of the modulated and \
demodulated amplitude of radio waves. The user may plot curves \
of modulated signals, wave carrier, signal modulation, signal \
recovery and signal demodulation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn19591"

RPM_NAME = "texlive-pst-am-2023.209.1.02svn19591-53.1.noarch.rpm"
RPM_HASH = "1b0b71c2b3faea379f64add04dc76a9a22363d2f822900e67002acc979d98d0f53680b8c7757fa73e90bbabbf287167852c2d9ff6e29a8e8e06073f5bc88d50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-am.sty \
texlive-pst-am"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-numprint.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
