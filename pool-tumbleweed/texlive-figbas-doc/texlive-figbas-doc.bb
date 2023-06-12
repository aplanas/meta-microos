SUMMARY = "Documentation for texlive-figbas"
DESCRIPTION = "This package includes the documentation for texlive-figbas"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.3svn28943"

RPM_NAME = "texlive-figbas-doc-2023.201.1.0.3svn28943-52.1.noarch.rpm"
RPM_HASH = "f9be498fe5cc9fe90b087a4da2b022e5e599a2f609fd70c9991bce607ede62e892680a88b003fd00b57e95d59f7a5efd46199bbd28a0df77785f19c685c7be34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figbas-doc"
RDEPENDS:${PN} += ""

inherit rpm
