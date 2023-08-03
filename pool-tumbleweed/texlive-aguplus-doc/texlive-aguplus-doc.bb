SUMMARY = "Documentation for texlive-aguplus"
DESCRIPTION = "This package includes the documentation for texlive-aguplus"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6bsvn17156"

RPM_NAME = "texlive-aguplus-doc-2023.209.1.6bsvn17156-55.1.noarch.rpm"
RPM_HASH = "69ad9aa10c14d121fbe3fd86c66f874cefae8fd0822acfe59e1c8cf2ecfb8cf7ff90efd9f971d31681a28e50d3301da3863b0f0facb532b8a4b4e1db1da3a798"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aguplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
