SUMMARY = "Activating and setting of character protruding using pdfLaTeX"
DESCRIPTION = "This package provides an easy interface to adjust the character \
protrusion for different fonts and choosing the right \
adjustment automatically depending on the font. The package is \
largely superseded by microtype."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7asvn18735"

RPM_NAME = "texlive-pdfcprot-2023.201.1.7asvn18735-51.1.noarch.rpm"
RPM_HASH = "7ba9a9e5e72e1113757ec06c7b2e1b8e713d98ae4d08e64c50befccde1dd95f06ba2c2f998342f3d0012666d9b0d1d4646265e5e17a521c726b0a15df61fbc14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcprot.sty \
texlive-pdfcprot"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
