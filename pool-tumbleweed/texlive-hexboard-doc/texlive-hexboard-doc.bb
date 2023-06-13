SUMMARY = "Documentation for texlive-hexboard"
DESCRIPTION = "This package includes the documentation for texlive-hexboard"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62102"

RPM_NAME = "texlive-hexboard-doc-2023.201.1.0svn62102-53.1.noarch.rpm"
RPM_HASH = "70ccfd99c95f9b98c738be7b0993b157b9ad732eec5583c4560d28c2359787069d841df11348980990b68d845c3ec50f3cdb25c39ad945909cd3752ab11ad666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hexboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
