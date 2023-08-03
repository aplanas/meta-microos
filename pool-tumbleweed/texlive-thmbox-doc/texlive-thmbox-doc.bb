SUMMARY = "Documentation for texlive-thmbox"
DESCRIPTION = "This package includes the documentation for texlive-thmbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-thmbox-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "cec003f0a5cdc5252a8084a1812540c3221ecfae710c402db5c0ca5c5fe0f8f8298097c90e8616a5944827f21e6c82e69206a4ea384998e4690e3c7e48cc62cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thmbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
