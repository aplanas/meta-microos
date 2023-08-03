SUMMARY = "Schematic diagrams of lakes"
DESCRIPTION = "This package contains a collection of schematic diagrams of \
lakes for use in LaTeX documents. Diagrams include \
representations of material budgets, fluxes, and connectivity \
arrangements."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55288"

RPM_NAME = "texlive-tikz-lake-fig-2023.209.1.0svn55288-53.1.noarch.rpm"
RPM_HASH = "0dca4eec8b68b09ac6d758d13395c1d36ed074e0d396548233c050a31ae86a8c686c972f576d69c1c72bcf40387e17746df6c00669d6eab388817b45a99886b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-lake-fig.sty \
texlive-tikz-lake-fig"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-colortbl.sty \
tex-multirow.sty \
tex-pbox.sty \
tex-relsize.sty \
tex-subfiles.sty \
tex-tabularx.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
