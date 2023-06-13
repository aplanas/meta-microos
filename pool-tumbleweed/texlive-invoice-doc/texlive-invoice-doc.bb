SUMMARY = "Documentation for texlive-invoice"
DESCRIPTION = "This package includes the documentation for texlive-invoice"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn48359"

RPM_NAME = "texlive-invoice-doc-2023.201.svn48359-52.1.noarch.rpm"
RPM_HASH = "079db615faf1c502eec6516b0d9d759e56440155a77798882bc485ccea535391d11c847350871a164afa54858db7072e0b5a4a8cdbc8075c366584073cb41c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-invoice-doc"

RDEPENDS:${PN} += ""

inherit rpm
