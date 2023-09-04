SUMMARY = "Produces a standard US invoice from a CSV file"
DESCRIPTION = "This class produces a standard US commercial invoice using data \
from a CSV file. Invoices can span multiple pages. The class is \
configurable for different shipping addresses."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn49749"

RPM_NAME = "texlive-invoice-class-2023.209.1.0svn49749-54.1.noarch.rpm"
RPM_HASH = "a6f120155f2c7d272949c09821985d04b2df09677fa93763a7c89956c8053d451fed98e8ffb6e503cea37d98a94a8adcf93c5d78a765ddf8edbb9dc306b7505a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-invoice-class.cls \
texlive-invoice-class"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-datatool.sty \
tex-dcolumn.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-longtable.sty \
tex-multicol.sty \
tex-tabularx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
