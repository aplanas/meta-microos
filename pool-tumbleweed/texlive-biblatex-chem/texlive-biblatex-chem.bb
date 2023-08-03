SUMMARY = "A set of BibLaTeX implementations of chemistry-related bibliography styles"
DESCRIPTION = "The bundle offers a set of styles to allow chemists to use \
BibLaTeX. The package has complete styles for: all ACS \
journals; RSC journals using standard (Chem. Commun.) style; \
and Angewandte Chem. style, (thus covering a wide range of \
journals). A comprehensive set of examples of use is included."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1zsvn57904"

RPM_NAME = "texlive-biblatex-chem-2023.209.1.1zsvn57904-54.1.noarch.rpm"
RPM_HASH = "e084b9393bab8502c32258c3a94b7a318de483082d1ba7f4a64b3ec29a7a4d8b613f3ccca1b99538efd3ed469f8cb791a7ea1e818ad5445fc8c82be45c7624be"
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
