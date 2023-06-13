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

PV = "2023.201.1.2.2svn65690"

RPM_NAME = "texlive-pseudo-2023.201.1.2.2svn65690-52.1.noarch.rpm"
RPM_HASH = "ebccfabffac90d0167f6a1fa32e47d81a4d0e9e6f0adba7d5a4edd52ae9edd9c090f863c10a1fa8603b20c57ebbdd628860fc27506d42ab17f6dfa1af32d88b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pseudo.sty) \
texlive-pseudo"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(aliascnt.sty) \
tex(array.sty) \
tex(colortbl.sty) \
tex(etoolbox.sty) \
tex(expl3.sty) \
tex(l3keys2e.sty) \
tex(pgfkeys.sty) \
tex(xcolor.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
