SUMMARY = "Produces a standard US invoice from a CSV file"
DESCRIPTION = "This class produces a standard US commercial invoice using data \
from a CSV file. Invoices can span multiple pages. The class is \
configurable for different shipping addresses."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn49749"

RPM_NAME = "texlive-invoice-class-2023.208.1.0svn49749-53.1.noarch.rpm"
RPM_HASH = "160855ca3a1fc2104c5aa1b6381221b077957c8722ae8534af3afa4ce912f522543d34de9716dda637eaf4e3e618c262c8d02a2ddb280c5f87b8e9152cc88b71"
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
