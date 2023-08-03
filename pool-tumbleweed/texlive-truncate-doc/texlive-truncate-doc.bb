SUMMARY = "Documentation for texlive-truncate"
DESCRIPTION = "This package includes the documentation for texlive-truncate"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.3.6svn18921"

RPM_NAME = "texlive-truncate-doc-2023.209.3.6svn18921-53.1.noarch.rpm"
RPM_HASH = "24b7f879d2e910f73eaf6870787235919f6f207afecd44ef1288e19699d36d9abacfda479f1488963db47d51f739b6940258c7b1b795cc2b9a484fef2e7132e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-truncate-doc"

RDEPENDS:${PN} += ""

inherit rpm
