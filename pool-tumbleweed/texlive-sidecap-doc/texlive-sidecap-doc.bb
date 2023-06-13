SUMMARY = "Documentation for texlive-sidecap"
DESCRIPTION = "This package includes the documentation for texlive-sidecap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7asvn65618"

RPM_NAME = "texlive-sidecap-doc-2023.201.1.7asvn65618-53.1.noarch.rpm"
RPM_HASH = "3461f851cb8f72c0e4b972a6eda589b0d07cc8e4f9f74fa60d9c37d2b734f95fc474e7ef6cde6b024b4d43bd23f930f42106641d34649133d19029a81088d7f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidecap-doc"

RDEPENDS:${PN} += ""

inherit rpm
