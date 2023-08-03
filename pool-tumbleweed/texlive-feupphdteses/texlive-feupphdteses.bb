SUMMARY = "Typeset Engineering PhD theses at the University of Porto"
DESCRIPTION = "A complete template for thesis/works of Faculdade de Engenharia \
da Universidade do Porto (FEUP) Faculty of Engineering \
University of Porto."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.0svn30962"

RPM_NAME = "texlive-feupphdteses-2023.209.4.0svn30962-53.1.noarch.rpm"
RPM_HASH = "a565076459eb14b4ded179f2523c64c3e797d220edab7b3a316adb566f9ef4175a4998f97287b0724961c313581d5639945f4662b9985bd83ee3e6a4236a8bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-feupphdteses.sty \
texlive-feupphdteses"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-amsmath.sty \
tex-array.sty \
tex-babel.sty \
tex-backref.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-couriers.sty \
tex-enumitem.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-grffile.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-inputenc.sty \
tex-lineno.sty \
tex-listings.sty \
tex-longtable.sty \
tex-makeidx.sty \
tex-mathptmx.sty \
tex-multirow.sty \
tex-natbib.sty \
tex-pdflscape.sty \
tex-pdfpages.sty \
tex-pgfgantt.sty \
tex-pgfplots.sty \
tex-placeins.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tabularx.sty \
tex-tabulary.sty \
tex-tikz.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
