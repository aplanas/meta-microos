SUMMARY = "Documentation for texlive-ltabptch"
DESCRIPTION = "This package includes the documentation for texlive-ltabptch"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.74dsvn17533"

RPM_NAME = "texlive-ltabptch-doc-2023.208.1.74dsvn17533-53.1.noarch.rpm"
RPM_HASH = "400fd5f51579968769c406855544626e7660c46fcf057c74de2d84156750f4f486dbcf3dafa70d26c228f7d0ef2a403a44ed8d7ba777789ffde13c9d4058d8dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltabptch-doc"

RDEPENDS:${PN} += ""

inherit rpm
