SUMMARY = "Global Ecology and Biogeography BibLaTeX styles for the Biber backend"
DESCRIPTION = "This bundle provides a set of styles for creating \
bibliographies using BibLaTeX in the style of the Global \
Ecology and Biogeography journal. It comprises styles based on \
the conventions of John Wiley & Sons Ltd and Global Ecology and \
Biogeography Conventions (c)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39233"

RPM_NAME = "texlive-ecobiblatex-2023.201.1.0svn39233-53.2.noarch.rpm"
RPM_HASH = "578fc42e1d753a26f332833d0f70039a62596fa6eb2aea0e34ba2eb916a3be5efdb615e631314851c2b191c8d33dd7709d39068ed0903a40f3ba0620a4b097f1"
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
