SUMMARY = "Documentation for texlive-pdfmsym"
DESCRIPTION = "This package includes the documentation for texlive-pdfmsym"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn65324"

RPM_NAME = "texlive-pdfmsym-doc-2023.209.1.1.0svn65324-52.1.noarch.rpm"
RPM_HASH = "a8f4d25f51b7ae9d2158161d6a94deeeefc8ea0a43fa9d19f3557a7d1f6b59d15e891adbc71d55473a5a4c216240fd5cd99e8f186aa22f115a8791c35d8dc91d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfmsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
