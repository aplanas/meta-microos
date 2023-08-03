SUMMARY = "Activating and setting of character protruding using pdfLaTeX"
DESCRIPTION = "This package provides an easy interface to adjust the character \
protrusion for different fonts and choosing the right \
adjustment automatically depending on the font. The package is \
largely superseded by microtype."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7asvn18735"

RPM_NAME = "texlive-pdfcprot-2023.209.1.7asvn18735-52.1.noarch.rpm"
RPM_HASH = "60cf8867971feeb6da51ca47ef9e41d26c87b784f0dfd6835080900176e4a5e965143fa7d9c639f4903e4fbe15dea198706ef07a154f697e0007df85ecc30ed7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfcprot.sty \
texlive-pdfcprot"

RDEPENDS:${PN} += "/usr/bin/sh \
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
