SUMMARY = "Spot colours for pdfLaTeX"
DESCRIPTION = "This package provides procedures for using spot colours in \
LaTeX documents and the generated pdf files. Predefined \
templates for PANTONE and HKS colour spaces are included but \
new ones can easily be defined."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn15878"

RPM_NAME = "texlive-spotcolor-2023.209.1.2svn15878-58.1.noarch.rpm"
RPM_HASH = "58b3a44a023acdec99e1cee1280fee14c53703d7d89a767f0dba452389e12177b70579d071e678ddb46c5ba7c4ecc4c904f892451354b13eff511c5caab90edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spotcolor.sty \
tex-spotcolorhks.tex \
tex-spotcolorpantone.tex \
texlive-spotcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
