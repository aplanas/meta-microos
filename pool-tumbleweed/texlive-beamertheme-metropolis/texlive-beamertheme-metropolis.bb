SUMMARY = "A modern LaTeX beamer theme"
DESCRIPTION = "The package provides a simple, modern Beamer theme for anyone \
to use. It tries to minimize noise and maximize space for \
content."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn43031"

RPM_NAME = "texlive-beamertheme-metropolis-2023.209.1.2svn43031-54.1.noarch.rpm"
RPM_HASH = "9e579e5affb3b226c01016bb0db03df4df97565e323d94dafac9bf9c5a3ce443a498b2a972d2e546a867d178f29d8df068d33aff332b680ecfbe92e170ed37c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthememetropolis-highcontrast.sty \
tex-beamercolorthememetropolis.sty \
tex-beamerfontthememetropolis.sty \
tex-beamerinnerthememetropolis.sty \
tex-beamerouterthememetropolis.sty \
tex-beamerthememetropolis.sty \
tex-pgfplotsthemetol.sty \
texlive-beamertheme-metropolis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-keyval.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
