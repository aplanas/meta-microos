SUMMARY = "Documentation for texlive-chemcompounds"
DESCRIPTION = "This package includes the documentation for texlive-chemcompounds"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-chemcompounds-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "e8f55f1ca6dede28983098e1180a66afe7de5afdcd71966236eb83163e1211a6ef2afcc8f266d9d7195a27a1ce5292d0a068a57866c91336e70a29477c403e04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemcompounds-doc"

RDEPENDS:${PN} += ""

inherit rpm
