SUMMARY = "Documentation for texlive-exsheets"
DESCRIPTION = "This package includes the documentation for texlive-exsheets"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21ksvn52227"

RPM_NAME = "texlive-exsheets-doc-2023.209.0.0.21ksvn52227-53.1.noarch.rpm"
RPM_HASH = "e886570ccaba60e957b996d47dd175a680e58108e4288beb53af6c2c40d0e480318be46d3c4f01e74dc3c6a9e8fe4fdb67f7c54b56fde63c7fe05dc851a7ec04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exsheets-doc"

RDEPENDS:${PN} += ""

inherit rpm
