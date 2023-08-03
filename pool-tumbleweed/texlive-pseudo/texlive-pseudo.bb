SUMMARY = "Straightforward pseudocode"
DESCRIPTION = "The package permits writing pseudocode without much fuss and \
with quite a bit of configurability. Its main environment \
combines aspects of enumeration, tabbing and tabular for \
nonintrusive line numbering, indentation and highlighting, and \
there is functionality for typesetting common syntactic \
elements such as keywords, identifiers, and comments. The \
package relies on aliascnt, array, colortbl, expl3, l3keys2e, \
xcolor, and xparse."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.2svn65690"

RPM_NAME = "texlive-pseudo-2023.209.1.2.2svn65690-53.1.noarch.rpm"
RPM_HASH = "47679ba892168598053591e2c935056e84723095b09167f436f7b1f2249f7beb5b303e216aaba333c10c81cc3f527e19748184901521ea36b6c3dd148c61efdf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pseudo.sty \
texlive-pseudo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aliascnt.sty \
tex-array.sty \
tex-colortbl.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-pgfkeys.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
