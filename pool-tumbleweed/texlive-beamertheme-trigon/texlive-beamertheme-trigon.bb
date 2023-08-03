SUMMARY = "A modern, elegant, and versatile theme for Beamer"
DESCRIPTION = "This package provides a modern, elegant and versatile theme for \
Beamer, with a high degree of customization. Trigon found its \
origin and inspiration in the graphical guidelines resulting \
from the visual identity overhaul of the University of Liege. \
Although directly inspired from these guidelines, the theme was \
stripped out of any mention or specificities related to the \
University and its faculties. This makes the Trigon theme \
perfectly suitable for many different contexts. The final \
product provides a modern, elegant and versatile theme with a \
high degree of customization. The main design focuses on \
triangular shapes for major layout elements and noise \
minimization for the main body of the work. The theme's \
implementation is heavily inspired from the Metropolis theme. \
Most options from Metropolis have been ported to Trigon in \
order to improve customization and ease-of-use. Trigon also \
includes different styles and layouts for the main title page, \
the section page and the default slide background."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.0svn65985"

RPM_NAME = "texlive-beamertheme-trigon-2023.209.0.0.7.0svn65985-54.1.noarch.rpm"
RPM_HASH = "a3fa7751db3f12dbdef33009efb3020047650ab9481ad3e73a6da9195e1fdbc563fc69c28df439b9807753a87c864fa077c5cd387765e8984cefe10efe23ac31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemetrigon.sty \
tex-beamerfontthemetrigon.sty \
tex-beamerinnerthemetrigon.sty \
tex-beamerouterthemetrigon.sty \
tex-beamerthemetrigon.sty \
texlive-beamertheme-trigon"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfopts.sty \
tex-sourcesanspro.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
