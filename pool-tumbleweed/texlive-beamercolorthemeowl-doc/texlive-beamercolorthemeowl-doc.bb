SUMMARY = "Documentation for texlive-beamercolorthemeowl"
DESCRIPTION = "This package includes the documentation for texlive-beamercolorthemeowl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.1svn40105"

RPM_NAME = "texlive-beamercolorthemeowl-doc-2023.201.0.0.1.1svn40105-53.1.noarch.rpm"
RPM_HASH = "4bda18bc6576dd9eb59d1ab8a42d061e1bebf284ab59d2194b7537f84676f6173c76ba594cfd1aeaa30482e739949ffb900ca7c7006cf1b78ba113bed20de73c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamercolorthemeowl-doc"
RDEPENDS:${PN} += ""

inherit rpm
