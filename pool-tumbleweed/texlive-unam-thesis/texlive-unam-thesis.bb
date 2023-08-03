SUMMARY = "Create documents according to the UNAM guidelines"
DESCRIPTION = "This is a class for creating dissertation documents according \
to the National Autonomous University of Mexico (UNAM) \
guidelines."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.5svn51207"

RPM_NAME = "texlive-unam-thesis-2023.209.0.0.5svn51207-54.1.noarch.rpm"
RPM_HASH = "870e72f49a4360899fe664b79bc9cd8b15b1db59770212d60fd89550012825afe47d901beec56c75e758417f17c37dc7e123462f4e7325a57663d317c14c2a17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unam-thesis.cls \
texlive-unam-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-book.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inconsolata.sty \
tex-inputenc.sty \
tex-listingsutf8.sty \
tex-longtable.sty \
tex-microtype.sty \
tex-multirow.sty \
tex-pdfpages.sty \
tex-physics.sty \
tex-pslatex.sty \
tex-setspace.sty \
tex-subcaption.sty \
tex-titlesec.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
