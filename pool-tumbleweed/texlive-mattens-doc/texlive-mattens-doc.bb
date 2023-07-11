SUMMARY = "Documentation for texlive-mattens"
DESCRIPTION = "This package includes the documentation for texlive-mattens"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.3bsvn62326"

RPM_NAME = "texlive-mattens-doc-2023.208.1.3bsvn62326-53.1.noarch.rpm"
RPM_HASH = "9066ce723cf2e6abc92a06b02d5ec23353c1bcf44a513b6ee9945d3d530355b03b9ab919ff554e18063df8386a2da63a246fa8c6f1e5c7ba9775e6bb35128a4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mattens-doc"

RDEPENDS:${PN} += ""

inherit rpm
