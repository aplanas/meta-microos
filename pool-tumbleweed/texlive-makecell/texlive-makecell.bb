SUMMARY = "Tabular column heads and multilined cells"
DESCRIPTION = "This package supports common layouts for tabular column heads \
in whole documents, based on one-column tabular environment. In \
addition, it can create multi-lined tabular cells. The Package \
also offers: a macro which changes the vertical space around \
all the cells in a tabular environment (similar to the function \
of the tabls package, but using the facilities of the array) \
macros for multirow cells, which use the facilities of the \
multirow package; macros to number rows in tables, or to skip \
cells; diagonally divided cells; horizontal lines in tabular \
environments with defined thickness."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1esvn15878"

RPM_NAME = "texlive-makecell-2023.208.0.0.1esvn15878-53.1.noarch.rpm"
RPM_HASH = "b7848e327400890f73637b69d104bf45152e698654d2089709e1e83039436d05daeb0818588d6e0a641cee05ea7a44ac6aab44e186f91e2c5c3b2d678984ce8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makecell.sty \
texlive-makecell"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
