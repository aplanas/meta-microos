SUMMARY = "Documentation for texlive-gmdoc-enhance"
DESCRIPTION = "This package includes the documentation for texlive-gmdoc-enhance"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-doc-2023.201.0.0.2svn15878-53.1.noarch.rpm"
RPM_HASH = "38116b6cd8fcd269d99da508f36a683f01b2163d3214dd24858290fafed99a586af8d441ac51f6017fefd4b700faf61a497ce06482afd6bab115c6a1ed380376"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmdoc-enhance-doc"

RDEPENDS:${PN} += ""

inherit rpm
