SUMMARY = "BibLaTeX style for the International Journal of Student Research in Archaeology"
DESCRIPTION = "BibLaTeX style used for the journal International Journal of \
Student Research in Archaeology."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn41634"

RPM_NAME = "texlive-biblatex-ijsra-2023.209.0.0.1svn41634-54.1.noarch.rpm"
RPM_HASH = "abd5d5ea24e9ecca7a796433a850e95f8e398044ed818e7b047152f1c949a556f1d00f66fcdda8215ad9b645742c550dc679aa76d96b0c30b85cb788ddf649e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ijsra.bbx \
tex-ijsra.cbx \
texlive-biblatex-ijsra"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear.bbx \
tex-authoryear.cbx \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
