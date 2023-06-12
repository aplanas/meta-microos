SUMMARY = "Documentation for texlive-exsheets"
DESCRIPTION = "This package includes the documentation for texlive-exsheets"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21ksvn52227"

RPM_NAME = "texlive-exsheets-doc-2023.201.0.0.21ksvn52227-52.1.noarch.rpm"
RPM_HASH = "40e2d97614a82b3fa45b7de9d9ced112e0e6fa4131a32de504c377f6b956c3c462bb9e45b1fed0d8e51f6caae76333a7deaf057768f172fac4cfdf301f116827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exsheets-doc"
RDEPENDS:${PN} += ""

inherit rpm
