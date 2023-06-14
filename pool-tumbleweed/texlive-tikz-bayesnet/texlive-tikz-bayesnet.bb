SUMMARY = "Draw Bayesian networks, graphical models and directed factor graphs"
DESCRIPTION = "The package provides a library supporting the display of \
Bayesian networks, graphical models and (directed) factor \
graphs in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn38295"

RPM_NAME = "texlive-tikz-bayesnet-2023.201.0.0.1svn38295-54.1.noarch.rpm"
RPM_HASH = "7644055a61d0465850f29383b64124f322618f1e3d98300d1b4f4e8f64f06be1af3b443f2e12ca1c276c40963d751b3064d2798b5d497b8655d82b705d729ded"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarybayesnet.code.tex \
texlive-tikz-bayesnet"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
