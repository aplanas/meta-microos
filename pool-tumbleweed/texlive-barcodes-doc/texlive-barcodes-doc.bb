SUMMARY = "Documentation for texlive-barcodes"
DESCRIPTION = "This package includes the documentation for texlive-barcodes"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-barcodes-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "2a4c17ebfa62b2614a765b9d14901357ac53e6527167577a40407647b8c233a02a2c55ce1893a292275dea7408e01aa2d5d7511c005d5c05f339376e7bbafb00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barcodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
