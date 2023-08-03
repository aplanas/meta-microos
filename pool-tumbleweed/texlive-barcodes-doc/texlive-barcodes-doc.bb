SUMMARY = "Documentation for texlive-barcodes"
DESCRIPTION = "This package includes the documentation for texlive-barcodes"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-barcodes-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "0f437423cd4b3c687e34308a7c90a2872f05161f9f2b26dc97cc051bf7c5fc1737db0958f53ffed60351458b3859eea90f356da1e47b63cf0c74e759e57d7511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barcodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
