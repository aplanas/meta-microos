SUMMARY = "Global Ecology and Biogeography BibLaTeX styles for the Biber backend"
DESCRIPTION = "This bundle provides a set of styles for creating \
bibliographies using BibLaTeX in the style of the Global \
Ecology and Biogeography journal. It comprises styles based on \
the conventions of John Wiley & Sons Ltd and Global Ecology and \
Biogeography Conventions (c)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-2023.209.1.0svn39233-54.2.noarch.rpm"
RPM_HASH = "060a6cc5c7da5297401cb5e704289a93b92c4d556da27ec029980a7c0101396a8d50a9bc145b67472d82ff2899f8befd81db7b56a78db5eb60b6c29d0aae849a"
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
