SUMMARY = "Documentation for texlive-mlist"
DESCRIPTION = "This package includes the documentation for texlive-mlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6asvn15878"

RPM_NAME = "texlive-mlist-doc-2023.209.0.0.6asvn15878-55.1.noarch.rpm"
RPM_HASH = "8fb21f972c94541f94cc87611a009855472d9f122d6839b94fba53fafadd7048a729d52afb82d4bd2729926b9cfe095dfe83cc92fc3c56ff083796377173a28a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
