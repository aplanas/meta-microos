SUMMARY = "Unofficial beamer theme for the University of Hohenheim"
DESCRIPTION = "The package provides a beamer theme which features the Ci \
colors of the University of Hohenheim. Please note that this is \
not an official Theme, and that there will be no support for \
it, from the University. Furthermore there is NO relationship \
between the University and this theme."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn27036"

RPM_NAME = "texlive-hobete-2023.209.svn27036-54.1.noarch.rpm"
RPM_HASH = "421f7d0c5858e0829c29f959808b373776ca2bfc9cc4ec23fdbb2eb71b477052021b62d0874714b45dc584b9bc22ba7fbeeb946ac830d8b47a7feb896a6ef04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemehohenheim.sty \
tex-beamerouterthemehohenheim.sty \
tex-beamerouterthemehohenheimposter.sty \
tex-beamerthemehohenheim.sty \
tex-hobete.sty \
texlive-hobete"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-tikz.sty \
tex-xfrac.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
