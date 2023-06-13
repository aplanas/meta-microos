SUMMARY = "Documentation for texlive-reledmac"
DESCRIPTION = "This package includes the documentation for texlive-reledmac"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.39.1svn63105"

RPM_NAME = "texlive-reledmac-doc-2023.201.2.39.1svn63105-53.1.noarch.rpm"
RPM_HASH = "e11e246f6a270caebc538f5c46301344ca3244d96ef9d5d87c877d33317c9262500a35e3af581f9b070fcc573a5c91de5b6365ed28c9def344f934b500d3371c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reledmac-doc"

RDEPENDS:${PN} += ""

inherit rpm
