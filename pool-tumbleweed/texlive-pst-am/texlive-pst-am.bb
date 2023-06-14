SUMMARY = "Simulation of modulation and demodulation"
DESCRIPTION = "The package allows the simulation of the modulated and \
demodulated amplitude of radio waves. The user may plot curves \
of modulated signals, wave carrier, signal modulation, signal \
recovery and signal demodulation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn19591"

RPM_NAME = "texlive-pst-am-2023.201.1.02svn19591-52.1.noarch.rpm"
RPM_HASH = "f6d89654eaf0ca686572ce47029bfa767e1332f2cbad031a3cb131927ce4ec98b0fc52815338e96b0cdee23e8a0f73e6c1e5eb8fa9ea6af97e3f6a92d3eda053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-am.sty \
texlive-pst-am"

RDEPENDS:${PN} += "/bin/sh \
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
