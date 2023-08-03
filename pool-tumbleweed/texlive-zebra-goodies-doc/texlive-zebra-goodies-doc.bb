SUMMARY = "Documentation for texlive-zebra-goodies"
DESCRIPTION = "This package includes the documentation for texlive-zebra-goodies"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.0svn51554"

RPM_NAME = "texlive-zebra-goodies-doc-2023.209.0.0.8.0svn51554-53.1.noarch.rpm"
RPM_HASH = "5a92c8516ca7e932d69e7b5aa0cb9ef4102453b52294dc5a645cc35889ebb1e8da273fae6395020ae60e6fc41bdcf2fc2c751e616b6fb12302675c8cdf3c302b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zebra-goodies-doc"

RDEPENDS:${PN} += ""

inherit rpm
