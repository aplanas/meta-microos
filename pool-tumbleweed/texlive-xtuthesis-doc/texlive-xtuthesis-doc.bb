SUMMARY = "Documentation for texlive-xtuthesis"
DESCRIPTION = "This package includes the documentation for texlive-xtuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-doc-2023.209.1.0svn47049-53.1.noarch.rpm"
RPM_HASH = "9499549861888a5c74007cc32cc68abe02cf2aa965b4a6211a8ee47c400d22d223798ca9e11dfe8840185e38eec06db307dd418e2de5216aac658e19ce64449c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xtuthesis-doc-zh \
texlive-xtuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
