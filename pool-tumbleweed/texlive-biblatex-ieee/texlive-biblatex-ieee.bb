SUMMARY = "IEEE style files for BibLaTeX"
DESCRIPTION = "This is a BibLaTeX style that implements the bibliography style \
of the IEEE for BibLaTeX. The implementation follows standard \
BibLaTeX conventions, and can be used simply by loading \
BibLaTeX with the appropriate option: \
\\usepackage[style=ieee]{biblatex} A demonstration database is \
provided to show how to format input for the style. \
biblatex-ieee requires BibLaTeX 2.7 or later, and works with \
both BibTeX and Biber as the database back-end."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3fsvn61243"

RPM_NAME = "texlive-biblatex-ieee-2023.209.1.3fsvn61243-54.1.noarch.rpm"
RPM_HASH = "86785ec493758868811f82b39a51986b1d51b929c612c583b7634b8b9d1c60657f49d3be6902aed3ac28ea263bf64cf7e266faccc456b8250406db4e018afecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ieee-alphabetic.bbx \
tex-ieee-alphabetic.cbx \
tex-ieee.bbx \
tex-ieee.cbx \
tex-magyar-ieee.lbx \
texlive-biblatex-ieee"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-alphabetic.cbx \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
