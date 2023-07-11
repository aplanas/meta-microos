SUMMARY = "Book publishing scheme (core LaTeX and add-ons)"
DESCRIPTION = "This is a book publishing scheme, containing core (Lua)LaTeX \
and selected additional packages likely to be useful for \
non-technical book publication. It does not contain additional \
fonts (different books need different fonts, and the packages \
are large), nor does it contain additional mathematical or \
other technical packages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn63547"

RPM_NAME = "texlive-scheme-bookpub-2023.208.svn63547-60.1.noarch.rpm"
RPM_HASH = "c5888571fb530ca190537eebc94d3e35197a308d4800513bbaa4c1d9efac50a327f74785a875f79aef049e7578b79b12d0b098cd72261c30220522bd65538e4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scheme-bookpub"

RDEPENDS:${PN} += "texlive-barcodes \
texlive-biber \
texlive-biblatex \
texlive-bookcover \
texlive-caption \
texlive-collection-basic \
texlive-collection-latex \
texlive-enumitem \
texlive-fontspec \
texlive-latexmk \
texlive-lipsum \
texlive-listings \
texlive-markdown \
texlive-memoir \
texlive-microtype \
texlive-minted \
texlive-novel \
texlive-octavo \
texlive-pdfpages \
texlive-pgf \
texlive-qrcode \
texlive-shapes \
texlive-titlesec \
texlive-tocloft \
texlive-tufte-latex \
texlive-willowtreebook"

inherit rpm
