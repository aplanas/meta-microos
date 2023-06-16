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

PV = "2023.201.1.3fsvn61243"

RPM_NAME = "texlive-biblatex-ieee-2023.201.1.3fsvn61243-53.1.noarch.rpm"
RPM_HASH = "0c00f7ffeba52403ae29ddd41e3fe2fa4a434cfcad7787875c3508fd6a16daadb6c2d1a73d4853a81470f9797b72d9f0572b013f19ea0bdd406c0cf1df1492a9"
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
