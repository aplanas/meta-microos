SUMMARY = "Convert chemical structures from ChemDraw, MDL molfile or SMILES using Open Babel"
DESCRIPTION = "This package provides a way to convert and include chemical \
structure graphics from various chemical formats, such as \
ChemDraw files, MDL molfile or SMILES notations using Open \
Babel. To use this LaTeX package, it is necessary to enable \
execution of the following external commands via latex \
-shell-escape. obabel (Open Babel) inkscape or rsvg-convert \
(for SVG -> PDF/EPS conversion) pdfcrop or ps2eps (optional; \
for cropping large margins of PDF/EPS)"
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.9lsvn64778"

RPM_NAME = "texlive-chemobabel-2023.209.0.0.9lsvn64778-54.1.noarch.rpm"
RPM_HASH = "ebfc46107937266e2859f15c7d93183ee97b0c601d88baff857198a2881f71f4b864d4a0be3c488dbfb11001ff9ea5e9ef21cdbdad74a8a534600f027ad4f2f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemobabel.sty \
texlive-chemobabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
