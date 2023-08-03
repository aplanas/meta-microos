SUMMARY = "Draw Bayesian networks, graphical models and directed factor graphs"
DESCRIPTION = "The package provides a library supporting the display of \
Bayesian networks, graphical models and (directed) factor \
graphs in LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn38295"

RPM_NAME = "texlive-tikz-bayesnet-2023.209.0.0.1svn38295-55.1.noarch.rpm"
RPM_HASH = "f7fc682dc7d8fd195af13774b2feb3800b3f1414c92f75159cbaff9e0438854329a7eb6f468daecf27f652c684972e45df674de2ed83a9078bf09fed05142f9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarybayesnet.code.tex \
texlive-tikz-bayesnet"

RDEPENDS:${PN} += "/usr/bin/sh \
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
