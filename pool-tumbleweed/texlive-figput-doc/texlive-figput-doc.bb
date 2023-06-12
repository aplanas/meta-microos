SUMMARY = "Documentation for texlive-figput"
DESCRIPTION = "This package includes the documentation for texlive-figput"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.90svn63957"

RPM_NAME = "texlive-figput-doc-2023.201.0.0.90svn63957-52.1.noarch.rpm"
RPM_HASH = "7865a1f3ef462851c45a981c7255042cf0c073c8371b49ebac15471012586e961fdc660a353989fa785aa03996046b55c73eddaff521bdf8a2f6d251298da105"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figput-doc"
RDEPENDS:${PN} += ""

inherit rpm
