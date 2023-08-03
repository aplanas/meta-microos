SUMMARY = "A beamer theme for Harbin Institute of Technology, ShenZhen"
DESCRIPTION = "This is a beamer theme designed for Harbin Institute of \
Technology, ShenZhen (HITSZ)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-2023.209.1.0.0svn54381-54.1.noarch.rpm"
RPM_HASH = "4c78a8fa2aa0f62efcdb8e3ba2a639025d8e1118d429039ad162cebd36d8af08295d72a21ed14cdec27e456b30a6dcfa32f358075767ce9f56b1cfa5ad97c4e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemehitszbeamer.sty \
tex-beamerinnerthemehitszbeamer.sty \
tex-beamerouterthemehitszbeamer.sty \
tex-beamerthemehitszbeamer.sty \
texlive-hitszbeamer"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ctex.sty \
tex-multicol.sty \
tex-multimedia.sty \
tex-natbib.sty \
tex-pgf.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
