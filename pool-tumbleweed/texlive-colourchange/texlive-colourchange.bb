SUMMARY = "Colourchange"
DESCRIPTION = "The package allows you to change the colour of the structural \
elements (inner theme and outer theme) of your beamer \
presentation during the presentation. There is a manual option \
but there is also the option to have your structure colour \
change from one colour to another as a function of how far \
through the presentation you are."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.22svn21741"

RPM_NAME = "texlive-colourchange-2023.209.1.22svn21741-54.1.noarch.rpm"
RPM_HASH = "12192298bd2d1ac89abe7598fdc44a0bd85d236a0a268f718078ced3f3f1f18bc4f01f4321c5adc91423f4707545bb1e09c0c7fae326dcbc30f16483842ac37f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-colourchange.sty \
texlive-colourchange"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-etoolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
