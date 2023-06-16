SUMMARY = "A set of BibLaTeX implementations of chemistry-related bibliography styles"
DESCRIPTION = "The bundle offers a set of styles to allow chemists to use \
BibLaTeX. The package has complete styles for: all ACS \
journals; RSC journals using standard (Chem. Commun.) style; \
and Angewandte Chem. style, (thus covering a wide range of \
journals). A comprehensive set of examples of use is included."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1zsvn57904"

RPM_NAME = "texlive-biblatex-chem-2023.201.1.1zsvn57904-53.1.noarch.rpm"
RPM_HASH = "bb5c72ad57ed789779fc3ce5bb2bda0f5b746edbfa8a263698ae147cbedf3b238d2d4c5cddf9a49a274a26ad2c3a8625838313fa7246fb061e09e440ea4a3f01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chem-acs.bbx \
tex-chem-acs.cbx \
tex-chem-angew.bbx \
tex-chem-angew.cbx \
tex-chem-biochem.bbx \
tex-chem-biochem.cbx \
tex-chem-rsc.bbx \
tex-chem-rsc.cbx \
texlive-biblatex-chem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-numeric-comp.bbx \
tex-numeric-comp.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
