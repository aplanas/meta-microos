SUMMARY = "Schematic diagrams of lakes"
DESCRIPTION = "This package contains a collection of schematic diagrams of \
lakes for use in LaTeX documents. Diagrams include \
representations of material budgets, fluxes, and connectivity \
arrangements."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55288"

RPM_NAME = "texlive-tikz-lake-fig-2023.201.1.0svn55288-52.1.noarch.rpm"
RPM_HASH = "8b36d317674972eefa02c797926b7b7ed94a0e9ca0840c03bf879bb606b227b39811cdc36f62934b687163b240b33be050f40c7370ee5397f927f5cf48814f77"
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
