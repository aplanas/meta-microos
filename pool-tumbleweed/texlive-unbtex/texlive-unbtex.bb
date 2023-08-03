SUMMARY = "A class for theses at University of Brasilia (UnB)"
DESCRIPTION = "This package provides a class based on abnTeX and compatible \
with pdflatex and biber to prepare bachelor, master, and \
doctoral theses for the University of Brasilia (UnB), Brazil. \
The class also comes with a template for the various types of \
theses for undergraduate and graduate programs at UnB. The \
documentation for the class and the comments in the templates \
are all written in Portuguese, the language of the target \
audience."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64634"

RPM_NAME = "texlive-unbtex-2023.209.1.2svn64634-54.1.noarch.rpm"
RPM_HASH = "bad3032eb4441051f999b2cd23fdd0d905e59d67bf198ffadafbc565769d58f5492c7ec05ab620d6bd50ad259d498e1aadb3ebbc2134236692c5503cb99158bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unbtex.cls \
texlive-unbtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-abntex2.cls \
tex-algorithm.sty \
tex-algpseudocode.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amsthm.sty \
tex-caption.sty \
tex-eso-pic.sty \
tex-fontenc.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-icomma.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-mdframed.sty \
tex-microtype.sty \
tex-multirow.sty \
tex-stix2.sty \
tex-subcaption.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
