SUMMARY = "Global Ecology and Biogeography BibLaTeX styles for the Biber backend"
DESCRIPTION = "This bundle provides a set of styles for creating \
bibliographies using BibLaTeX in the style of the Global \
Ecology and Biogeography journal. It comprises styles based on \
the conventions of John Wiley & Sons Ltd and Global Ecology and \
Biogeography Conventions (c)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-2023.209.1.0svn39233-54.1.noarch.rpm"
RPM_HASH = "1ad04aae249dae32781396cc31a1885f82e5684acc00093a68fa8c1f896b98218d665bec80eb1258774552dfd814fe637bdeefbc8b2332989a1e4c7ee547915d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecobiblatex.bbx \
tex-ecobiblatex.cbx \
texlive-ecobiblatex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-comp.bbx \
tex-authoryear-comp.cbx \
tex-standard.bbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
