SUMMARY = "Documentation for texlive-hang"
DESCRIPTION = "This package includes the documentation for texlive-hang"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn43280"

RPM_NAME = "texlive-hang-doc-2023.201.2.1svn43280-53.1.noarch.rpm"
RPM_HASH = "d6e0098fb33b9beb4616b789da5ebcec734c7ff97e36b5da00a8ab36ea48064cecc75190c8d2b0104de500ed66bfb085abaeeea646bf9ffeb84f6c07f1dcc10b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hang-doc"

RDEPENDS:${PN} += ""

inherit rpm
