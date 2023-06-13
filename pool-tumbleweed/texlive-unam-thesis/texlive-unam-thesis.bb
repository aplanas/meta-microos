SUMMARY = "Create documents according to the UNAM guidelines"
DESCRIPTION = "This is a class for creating dissertation documents according \
to the National Autonomous University of Mexico (UNAM) \
guidelines."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.5svn51207"

RPM_NAME = "texlive-unam-thesis-2023.201.0.0.5svn51207-53.1.noarch.rpm"
RPM_HASH = "772fa47f208af9641746532fcb8798c77a896a83bdada146e7e3530b5505925d280da1a2a064ac17453abc56782c4a377bdb30525c5e6fdb51a542c92aab9431"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(unam-thesis.cls) \
texlive-unam-thesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(babel.sty) \
tex(biblatex.sty) \
tex(book.cls) \
tex(booktabs.sty) \
tex(caption.sty) \
tex(csquotes.sty) \
tex(fancyhdr.sty) \
tex(fontenc.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(inconsolata.sty) \
tex(inputenc.sty) \
tex(listingsutf8.sty) \
tex(longtable.sty) \
tex(microtype.sty) \
tex(multirow.sty) \
tex(pdfpages.sty) \
tex(physics.sty) \
tex(pslatex.sty) \
tex(setspace.sty) \
tex(subcaption.sty) \
tex(titlesec.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
