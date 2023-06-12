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

PV = "2023.201.0.0.9lsvn64778"

RPM_NAME = "texlive-chemobabel-2023.201.0.0.9lsvn64778-53.1.noarch.rpm"
RPM_HASH = "439aab84d5970181558f4b449a0139a31838740385c175a23b673787bb19493878cfaca398e5d8f2f3be0cf6b6dc1837a94c119fa2b38cdaa8bf82ab4024ea7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chemobabel.sty) \
texlive-chemobabel"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(verbatim.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
