SUMMARY = "BibLaTeX support for Nature"
DESCRIPTION = "The bundle offers styles that allow authors to use BibLaTeX \
when preparing papers for submission to the journal Nature."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3dsvn57262"

RPM_NAME = "texlive-biblatex-nature-2023.209.1.3dsvn57262-54.1.noarch.rpm"
RPM_HASH = "dab7fa85868569b39345bc60dc34feb035bc96b8d75fc7b9483bbe28d731d0777405ff07dd346677ccf6b1d9f85d39d1047a4d538138364e4797aa443742d235"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nature.bbx \
tex-nature.cbx \
texlive-biblatex-nature"

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
