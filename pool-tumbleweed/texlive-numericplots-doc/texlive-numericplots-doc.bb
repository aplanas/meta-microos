SUMMARY = "Documentation for texlive-numericplots"
DESCRIPTION = "This package includes the documentation for texlive-numericplots"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0.2svn31729"

RPM_NAME = "texlive-numericplots-doc-2023.201.2.0.2svn31729-54.1.noarch.rpm"
RPM_HASH = "bfce042553fc575dc38a3e419077f3d22f11e7e696046b2abaadbca8c22a080aa05d8274676755a0f8c401daaf29c70f37db3b20689d3655cdbd3cc0a98cfde2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numericplots-doc"

RDEPENDS:${PN} += ""

inherit rpm
