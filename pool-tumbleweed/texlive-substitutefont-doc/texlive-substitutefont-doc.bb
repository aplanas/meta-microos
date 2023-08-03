SUMMARY = "Documentation for texlive-substitutefont"
DESCRIPTION = "This package includes the documentation for texlive-substitutefont"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.4svn32066"

RPM_NAME = "texlive-substitutefont-doc-2023.209.0.0.1.4svn32066-58.1.noarch.rpm"
RPM_HASH = "e5a3c32404859c9443eefd5e0a36824ed05a91f826d76a3c31a1ba8c6ed724a7cd253b9453f0cb25a283e6716b21522bfb29390e6fa86c2192b98dd99cd73fa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-substitutefont-doc"

RDEPENDS:${PN} += ""

inherit rpm
