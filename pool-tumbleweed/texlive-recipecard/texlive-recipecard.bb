SUMMARY = "Typeset recipes in note-card-sized boxes"
DESCRIPTION = "The recipecard class typesets recipes into note card sized \
boxes that can then be cut out and pasted on to note cards. The \
recipe then looks elegant and fits in the box of recipes."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-recipecard-2023.209.2.0svn15878-54.1.noarch.rpm"
RPM_HASH = "83600cc602401e284da25ee16bca72b4d8cad922ff8619140e461162dfd968569c11cc8063c11ccd9164e8989624cdca21407df27b4ad1711a8e8424166497f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recipecard.cls \
texlive-recipecard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-boxedminipage.sty \
tex-calc.sty \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
