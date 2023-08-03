SUMMARY = "Documentation for texlive-download"
DESCRIPTION = "This package includes the documentation for texlive-download"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52257"

RPM_NAME = "texlive-download-doc-2023.209.1.2svn52257-53.1.noarch.rpm"
RPM_HASH = "7b057937ed3264cf08460032eeeb4900b2df159f23a04e5ed337739c8f2a47158fb37e887d8ecbfd99e9447c99b63db0dceb2a63f26aadfbc1acc1d2a4c42d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-download-doc"

RDEPENDS:${PN} += ""

inherit rpm
