SUMMARY = "Beamer, using the style of FU Berlin"
DESCRIPTION = "The bundle provides a beamer-derived class and a theme style \
file for the corporate design of the Free University in Berlin. \
Users may use the class itself (FUbeamer) or use the theme in \
the usual way with \\usetheme{BerlinFU}. Examples of using both \
the class and the theme are provided; the PDF is visually \
identical, so the catalogue only lists one; the sources of the \
examples do of course differ."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02bsvn63161"

RPM_NAME = "texlive-beamer-fuberlin-2023.209.0.0.02bsvn63161-54.1.noarch.rpm"
RPM_HASH = "de430747533634974b7e533f6ac18a3a7ffdb20e30ca657b1704c78da39bccdff6830c99dbb09167c61df827086511df3281d4896331c009f818fbfddc7dfd26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-FUbeamer.cls \
tex-beamercolorthemeBerlinFU.sty \
tex-beamerfontthemeBerlinFU.sty \
tex-beamerouterthemeBerlinFU.sty \
tex-beamerthemeBerlinFU.sty \
texlive-beamer-fuberlin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-beamer.cls \
tex-fontenc.sty \
tex-graphicx-psmin.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
