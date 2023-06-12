SUMMARY = "Documentation for texlive-newfloat"
DESCRIPTION = "This package includes the documentation for texlive-newfloat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1lsvn52906"

RPM_NAME = "texlive-newfloat-doc-2023.201.1.1lsvn52906-54.1.noarch.rpm"
RPM_HASH = "f210e31a16366a4d02cbb6f51f21029c051331216720da2e7f75fc67fcd59b95db7e3568a78023e131c73a3226f03204669665174d39776aa4e231d2f551909c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newfloat-doc"
RDEPENDS:${PN} += ""

inherit rpm
