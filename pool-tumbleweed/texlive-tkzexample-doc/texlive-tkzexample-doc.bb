SUMMARY = "Documentation for texlive-tkzexample"
DESCRIPTION = "This package includes the documentation for texlive-tkzexample"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.45csvn63908"

RPM_NAME = "texlive-tkzexample-doc-2023.201.1.45csvn63908-52.1.noarch.rpm"
RPM_HASH = "037a9eb6494dd908a8e4bf572cab724c813ee6151859c25cab99a84317c98fa5d4917eab428521196008f4bac4b366f4a0b940a14a93e284a75c58a57384a4f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkzexample-doc"

RDEPENDS:${PN} += ""

inherit rpm
