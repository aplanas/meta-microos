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

PV = "2023.201.0.0.1esvn15878"

RPM_NAME = "texlive-makecell-2023.201.0.0.1esvn15878-52.1.noarch.rpm"
RPM_HASH = "74ba7418771376c6ccd5bdaf870ba4940da606b28224f2b6bb8baeda1f2acec4171a3f4094a39a13043fc7274bf42c08ff22af40484246df72f8dbe864780c45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makecell.sty \
texlive-makecell"

RDEPENDS:${PN} += "/bin/sh \
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
