SUMMARY = "A beamer theme for Harbin Institute of Technology, ShenZhen"
DESCRIPTION = "This is a beamer theme designed for Harbin Institute of \
Technology, ShenZhen (HITSZ)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-2023.201.1.0.0svn54381-53.2.noarch.rpm"
RPM_HASH = "74c3fea8b4033f1751eeb4b0dded3322eb4b13c71f853ddd0f45e764bfe91692cd115c349bf166a8e705499a8790bd29eb8b1fc4b1797a0617291d82ab616b04"
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
