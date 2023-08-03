SUMMARY = "A beamer theme for LALIC"
DESCRIPTION = "This package provides the beamer theme for LALIC (Laboratorio \
de Linguistica e Inteligencia Computacional of the Federal \
University of Sao Carlos, Brazil)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn58777"

RPM_NAME = "texlive-beamerthemelalic-2023.209.1.0svn58777-54.1.noarch.rpm"
RPM_HASH = "8982f9d5e6d7248ac65b1aaba96b4ab74d2c388745b8821558d92aedfa5806019fd01995248f90504b30dd0d101a8023c44901cc9983069773290f211c6322cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemelalic.sty \
tex-beamerfontthemelalic.sty \
tex-beamerinnerthemelalic.sty \
tex-beamerouterthemelalic.sty \
tex-beamerthemelalic.sty \
texlive-beamerthemelalic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calculator.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
