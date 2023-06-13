SUMMARY = "Book publishing scheme (core LaTeX and add-ons)"
DESCRIPTION = "This is a book publishing scheme, containing core (Lua)LaTeX \
and selected additional packages likely to be useful for \
non-technical book publication. It does not contain additional \
fonts (different books need different fonts, and the packages \
are large), nor does it contain additional mathematical or \
other technical packages."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn63547"

RPM_NAME = "texlive-scheme-bookpub-2023.208.svn63547-58.1.noarch.rpm"
RPM_HASH = "f62f89444c7b4db20b759133891db4a5969bb25e820a7c5527f35910586ebd0458cbc19c6c7689f642d2db1a8b58ba3f7bb846501996eb12bfb7928b3ac3fab4"
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
