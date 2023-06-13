SUMMARY = "Documentation for texlive-collectbox"
DESCRIPTION = "This package includes the documentation for texlive-collectbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4csvn64967"

RPM_NAME = "texlive-collectbox-doc-2023.201.0.0.4csvn64967-53.1.noarch.rpm"
RPM_HASH = "7c6ad3ff958646eac4b5d4d1d90089630319c8f5e735bd1d374d61d61f61bc079a26d7178d3b45f2c7bc5b87bd7487e83b39b4167c52187b8dcca2b9242fe256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collectbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
