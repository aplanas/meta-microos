SUMMARY = "A beamer theme for Harbin Institute of Technology, ShenZhen"
DESCRIPTION = "This is a beamer theme designed for Harbin Institute of \
Technology, ShenZhen (HITSZ)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn54381"

RPM_NAME = "texlive-hitszbeamer-2023.209.1.0.0svn54381-54.2.noarch.rpm"
RPM_HASH = "3a7fc0b1f7ae670588391afb00bf5e0623c79702237e59827d120228937afcb7659a1b4bdf22bd3f349f25de9464a2522438a3f077cfb73282ed4c7ab6964101"
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
