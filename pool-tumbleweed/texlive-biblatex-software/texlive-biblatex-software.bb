SUMMARY = "BibLaTeX stylefiles for software products"
DESCRIPTION = "This package implements software entry types for BibLaTeX in \
the form of a bibliography style extension. It requires the \
Biber backend."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2_5svn64030"

RPM_NAME = "texlive-biblatex-software-2023.201.1.2_5svn64030-53.1.noarch.rpm"
RPM_HASH = "54fa6e02a45b38d5b56b37a7df3bfde8f00e74d9995df8296e66515c70c4321df807955042ad52ac90a4cc0d8cdcb05abb512ee826ef01a413368976ee28cf80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-english-software.lbx \
tex-french-software.lbx \
tex-software-biblatex.sty \
tex-software.bbx \
texlive-biblatex-software"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-english.lbx \
tex-french.lbx \
tex-xurl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
