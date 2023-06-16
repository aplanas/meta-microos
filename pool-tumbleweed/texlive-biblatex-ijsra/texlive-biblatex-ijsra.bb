SUMMARY = "BibLaTeX style for the International Journal of Student Research in Archaeology"
DESCRIPTION = "BibLaTeX style used for the journal International Journal of \
Student Research in Archaeology."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn41634"

RPM_NAME = "texlive-biblatex-ijsra-2023.201.0.0.1svn41634-53.1.noarch.rpm"
RPM_HASH = "4de3bfbb3f9cbbb6e839d5e7c9773d7e425a3f847a6866a0e37425304808c955b22d2817247bd06bcbb5512affeaf77797770e8031d85f130f34d7c61b6e18ee"
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
