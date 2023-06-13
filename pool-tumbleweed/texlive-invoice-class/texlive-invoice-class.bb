SUMMARY = "Produces a standard US invoice from a CSV file"
DESCRIPTION = "This class produces a standard US commercial invoice using data \
from a CSV file. Invoices can span multiple pages. The class is \
configurable for different shipping addresses."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn49749"

RPM_NAME = "texlive-invoice-class-2023.201.1.0svn49749-52.1.noarch.rpm"
RPM_HASH = "4bb00012452aff9bbc5c37feb98412d47e778da1680b1d527118eb684c106573e2769a0d91081fbf752b551b5bda96688b846f49c77e93a3f2142f2a10b3dff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(invoice-class.cls) \
texlive-invoice-class"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(article.cls) \
tex(datatool.sty) \
tex(dcolumn.sty) \
tex(fancyhdr.sty) \
tex(geometry.sty) \
tex(longtable.sty) \
tex(multicol.sty) \
tex(tabularx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
